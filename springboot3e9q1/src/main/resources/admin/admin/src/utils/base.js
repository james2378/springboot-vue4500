const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot3e9q1/",
            name: "springboot3e9q1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot3e9q1/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "滴答拍摄影项目"
        } 
    }
}
export default base
