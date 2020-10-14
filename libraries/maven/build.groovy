void call(){
    stage("Maven: Build"){
        println "build from the maven library"
        mvn clean install
    }
}
