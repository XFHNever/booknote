package booknote

class Note {
    Long _id
    String detail
    Date dateCreated
    Date lastUpdated

    static constraints = {
        _id(nullable: false)
        detail(blank: false, nullable: false)
    }

    static belongsTo = [book : Book]
}
