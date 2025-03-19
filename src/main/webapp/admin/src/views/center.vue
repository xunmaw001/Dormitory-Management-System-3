<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item  v-if="flag=='xuesheng'"  label="学生账号" prop="xueshengzhanghao">
          <el-input v-model="ruleForm.xueshengzhanghao" 
              placeholder="学生账号" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='xuesheng'"  label="学生姓名" prop="xueshengxingming">
          <el-input v-model="ruleForm.xueshengxingming" 
              placeholder="学生姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='xuesheng'"  label="宿舍号" prop="sushehao">
          <el-select v-model="ruleForm.sushehao" placeholder="请选择宿舍号">
            <el-option
                v-for="(item,index) in xueshengsushehaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='xuesheng'"  label="密码" prop="mima">
          <el-input v-model="ruleForm.mima" 
              placeholder="密码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='xuesheng'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in xueshengxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='xuesheng'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang" 
              placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='xuesheng'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua" 
              placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
                                                            <el-col :span="12">
        <el-form-item  v-if="flag=='sushezhang'"  label="宿舍长账号" prop="sushezhangzhanghao">
          <el-input v-model="ruleForm.sushezhangzhanghao" 
              placeholder="宿舍长账号" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='sushezhang'"  label="宿舍长姓名" prop="sushezhangxingming">
          <el-input v-model="ruleForm.sushezhangxingming" 
              placeholder="宿舍长姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='sushezhang'"  label="密码" prop="mima">
          <el-input v-model="ruleForm.mima" 
              placeholder="密码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='sushezhang'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in sushezhangxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='sushezhang'"  label="宿舍号" prop="sushehao">
          <el-select v-model="ruleForm.sushehao" placeholder="请选择宿舍号">
            <el-option
                v-for="(item,index) in sushezhangsushehaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='sushezhang'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua" 
              placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='sushezhang'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang" 
              placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                                                                          <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                      xueshengsushehaoOptions: [],
                                    xueshengxingbieOptions: [],
                                                                                                                        sushezhangxingbieOptions: [],
                        sushezhangsushehaoOptions: [],
                                                                                                                                                                };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                    this.$http({
      url: `option/sushehao/sushehao`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.xueshengsushehaoOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                        this.xueshengxingbieOptions = "男,女".split(',')
                                                                                this.sushezhangxingbieOptions = "男,女".split(',')
                this.$http({
      url: `option/sushehao/sushehao`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.sushezhangsushehaoOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                                          },
  methods: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            onUpdateHandler() {
                              if((!this.ruleForm.xueshengzhanghao)&& 'xuesheng'==this.flag){
        this.$message.error('学生账号不能为空');
        return
      }
                                                            if((!this.ruleForm.xueshengxingming)&& 'xuesheng'==this.flag){
        this.$message.error('学生姓名不能为空');
        return
      }
                                                                                                            if((!this.ruleForm.mima)&& 'xuesheng'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                            if((!this.ruleForm.youxiang)&& 'xuesheng'==this.flag){
        this.$message.error('邮箱不能为空');
        return
      }
                                    if( 'xuesheng' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                    if((!this.ruleForm.lianxidianhua)&& 'xuesheng'==this.flag){
        this.$message.error('联系电话不能为空');
        return
      }
                                                                                                if((!this.ruleForm.sushezhangzhanghao)&& 'sushezhang'==this.flag){
        this.$message.error('宿舍长账号不能为空');
        return
      }
                                                            if((!this.ruleForm.sushezhangxingming)&& 'sushezhang'==this.flag){
        this.$message.error('宿舍长姓名不能为空');
        return
      }
                                                            if((!this.ruleForm.mima)&& 'sushezhang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                                                                    if( 'sushezhang' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
