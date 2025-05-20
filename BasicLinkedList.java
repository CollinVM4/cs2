import java.lang.*;

public class BasicLinkedList
{
    // FOUR BASIC ELEMENTS OF STORAGE SYSTEMS
    // CREATE, RETRIEVE, UPDATE, DELETE

    // EVERY METHOD 
    // WHAT IT DOES, WHAT PARAMS, WHAT IT RETURNS, WHAT CAN GO WRONG

    // CLASSES SHOULD
    // BE NAMED AFTER WHAT THEY ARE, NOT WHAT IT DOES
    // use camel case w/ first letter caps, LikeThis
    // CLASS COMMENTS should indicate what the class is for, and obvious limitations


    // A singly linked list, storing only the head. Accepts any java object. 
    // Probably wont work with primities 

    // consists of a value, and a next
    public class BasicLinkedListItem 
    {

        // NAME VARIABLES WHAT THEY ARE.
        public Object payload;
        public BasicLinkedListItem next;

        // constructor for a linked list item. Accepts the object to be wrapped, object should not be null
        public BasicLinkedListItem(Object newPayload)
        {
            payload = newPayload;
            next = null;
        }
    }

    // make head of the list 
    private BasicLinkedListItem head;



    // does not check last item,, fix
    // returns boolean, 1 if successfull, b/c we don't want duplicates
    public boolean Add(Object newPayload)
    {
        // treat special cases as special cases - trying to handle them inline 
        // usually casues more trouble than it's worth
        if(head == null)
        {
            // just create it 
            head = new BasicLinkedListItem(newPayload);
            return true;
        }
        // if we got here head isn't null

        // walk the list to the end
        BasicLinkedListItem walker = head;
        while(walker.next != null) // always use braces for conditional blocks
        {
            if (walker.payload.equals(newPayload))
            {
                return false; // if we encounter an item that's already in there 
            }

            walker = walker.next;
        }

        // walker is now at the tail of the list. TIME to make the donuts

        walker.next = new BasicLinkedListItem(newPayload);
        return true;

    }

    // Removes an item from the list. Return the item removed, or null if it wasn't in list.
    public Object Delete(Object target)
    {
        // walk the list to the end
        BasicLinkedListItem walker = head;
        while(walker.next != null) // always use braces for conditional blocks
        {
            if (walker.payload.equals(target))
            {
                return true; // found it
            }

            walker = walker.next; // traverse
        }

        return null;
    }


    // does not check last item,, fix
    // Checks if its in list, true if it is, false if not.
    public boolean isInList(Object target)
    {
        // if list empty, target cant be in it
        if(head == null)
        {
            return false;
        }

        // walk the list to the end
        BasicLinkedListItem walker = head;
        while(walker.next != null) // always use braces for conditional blocks
        {
            if (walker.payload.equals(target))
            {
                return true; // found it
            }

            walker = walker.next; // traverse
        }

        return false; // did not find it
    }

    // initializer
    public BasicLinkedList()
    {
        head = null;
    }


    public static void main(String[] args) throws Exception
    {
        // create a new linked list
        BasicLinkedList list = new BasicLinkedList();
        




    }
}

// why cannot have o(1) delete w/ current BetterLinkedList setup