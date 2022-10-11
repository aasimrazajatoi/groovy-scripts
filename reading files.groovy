class First {

    static void main (String [] args) 
    {
        //print all lines as string
        String filePath = "/home/dd/Downloads/hello.sh"
        File readableFile = new File(filePath)
        println readableFile.text

        //collect lines into a list
        def list = readableFile.collect{ it }
        println "list : $list"
    
        //read file as an aray
        def array = readableFile as String[]
        println "array : $array"


        //read file as a list of string
        def line = readableFile.readLines()
        println "lines : $line"
    
    }



}   
