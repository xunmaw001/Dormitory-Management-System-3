const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmjg491/",
            name: "ssmjg491",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmjg491/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "寝室管理系统"
        } 
    }
}
export default base
