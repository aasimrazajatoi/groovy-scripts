class First {

    static void main (String [] args) 
    {
        //print all lines as string
        println "Reading a file to print."
        println "Please wait..."
        String filePath = "/home/dd/Downloads/hello.sh"
        File readableFile = new File(filePath)
        println readableFile.txt

        //collect lines into a list
        println "Collecting lines into list."
        def list = readableFile.collect{ it }
        println "list : $list"
    
        //read file as an array
        println "Reading a file as an array."
        def array = readableFile as String[]
        println "array : $array"


        //read file as a list of string
        def line = readableFile.readLines()
        println "lines : $line"
    
    }



}   
