package booknote

class Book {
    Long _id
    String name
    String author
    String introduction
    Date dateCreated
    Date lastUpdated

    static constraints = {
        _id(nullable: false)
        name(blank: false)
        author(nullable: true)
        introduction(nullable: true)
    }

    static hasMany = [notes: Note]
}
