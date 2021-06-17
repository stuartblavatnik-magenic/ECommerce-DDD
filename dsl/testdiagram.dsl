workspace {

#hello world -- ensuring I can write and push changes to Structuizr

    model {
        user = person "User" "A user of my software system."
        user2 = person "User2" "Another user of my software system."
	    user3 = person "User3" "Yet Another user of my software system."       
        softwareSystem = softwareSystem "Software System" "My software system."

        user -> softwareSystem "Uses"
        user2 -> softwareSystem "Uses"
	    user3 -> softwareSystem "Uses"
    }

    views {
        systemContext softwareSystem {
            include *
            autoLayout
        }

        styles {
            element "Software System" {
                background #1168bd
                color #ffffff
            }
            element "Person" {
                shape person
                background #08427b
                color #ffffff
            }
        }
    }
    
}
