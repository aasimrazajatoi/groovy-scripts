class First {

    static void main (String [] args) 
    {
        //print all lines as string
        String filepath = "/home/dd/Downloads/hello.sh"
        File file = new File(filepath)
        println file.text

        //collect lines into a list
        def list = file.collect{ it }
        println "list : $list"
    
        //read file as an aray
        def array = file as String[]
        println "array : $array"


        //read file as a list of string
        def line = file.readLines()
        println "lines : $line"
    
    }



}   
