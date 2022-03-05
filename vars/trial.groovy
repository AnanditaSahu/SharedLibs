import groovy.io.FileType

def call(name){
  echo "Name is ${name}"
  def list = []

  def dir = new File("path_to_parent_dir")
  dir.eachFileRecurse (FileType.FILES) { file ->
    list << file
  }
}
