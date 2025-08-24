import java.util.Scanner;

public class DataStructures {
    public static void programs() {
        System.out.println("\t\t\t\t\t*****DataStructures PROGRAMS*****\t\t\t\t\t\n");
        System.out.println("1.LINKED LIST RELATED PROGRAMS");
        System.out.println("2.STACK RELATED PROGRAMS");
        System.out.println("3.QUEUE RELATED PROGRAMS");
        System.out.println("4.TREE RELATED PROGRAMS");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your option(1-4):");
        int option = s.nextInt();
        while (option >= 1 && option <= 4) {
            switch (option) {
                case 1: {
                    System.out.println("\n1.LINKED LIST RELATED PROGRAMS");
                    System.out.println("1.1.Singly Linked List");
                    System.out.println("1.2.Doubly Linked List");
                    System.out.println("1.3.Circular Linked List");
                    System.out.print("Enter your option(1-3):");
                    int subOption = s.nextInt();
                    while (subOption >= 1 && subOption <= 3) {
                        switch (subOption) {
                            case 1: {
                                System.out.println("\n1.1.Singly Linked List");
                                SingleLinkedList linkedList = new SingleLinkedList();
                                linkedList.createLinkedList(0);
                                System.out.println("LinkedList created");
                                System.out.println("****Single Linkedlist operations****");
                                System.out.println("1.Add First");
                                System.out.println("2.Add Last");
                                System.out.println("3.Add At Position");
                                System.out.println("4.Delete First");
                                System.out.println("5.Delete Last");
                                System.out.println("6.Delete At Position");
                                System.out.println("7.Display");
                                System.out.print("Enter your option(1-7):");
                                int option2 = s.nextInt();
                                while (option2 >= 1 && option2 <= 7) {
                                    switch (option2) {
                                        case 1: {
                                            System.out.println("\n1.Adding element to linkedlist at beginning");
                                            System.out.print("Enter the data to add at first: ");
                                            int ele = s.nextInt();
                                            linkedList.addFirst(ele);
                                            System.out.println("Element added at first");
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("\n2.Adding element to linkedlist at ending");
                                            System.out.print("Enter the data to add at last: ");
                                            int ele = s.nextInt();
                                            linkedList.addLast(ele);
                                            System.out.println("Element added at last");
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("\n3.Adding element to linkedlist at position");
                                            System.out.print("Enter the data to add : ");
                                            int ele = s.nextInt();
                                            System.out.print("Enter the position to add: ");
                                            int position = s.nextInt();
                                            linkedList.addAtPosition(ele, position);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("\n4.Deleting element from linkedlist at beginning");
                                            linkedList.deleteFirst();
                                            System.out.println("Element deleted from first");
                                            break;
                                        }
                                        case 5: {
                                            System.out.println("\n5.Deleting element from linkedlist at ending");
                                            linkedList.deleteLast();
                                            System.out.println("Element deleted from last");
                                            break;
                                        }
                                        case 6: {
                                            System.out.println("\n6.Deleting element from linkedlist at position");
                                            System.out.print("Enter the position to delete: ");
                                            int position = s.nextInt();
                                            linkedList.deleteAtPosition(position);
                                            break;
                                        }
                                        case 7: {
                                            System.out.println("\n7.Displaying elements of linkedlist");
                                            linkedList.display();
                                            break;
                                        }
                                    }
                                    System.out.println("\n****Single Linkedlist operations****");
                                    System.out.println("1.Add First");
                                    System.out.println("2.Add Last");
                                    System.out.println("3.Add At Position");
                                    System.out.println("4.Delete First");
                                    System.out.println("5.Delete Last");
                                    System.out.println("6.Delete At Position");
                                    System.out.println("7.Display");
                                    System.out.print("Enter your option(1-7):");
                                    option2 = s.nextInt();
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("\n1.2.Doubly Linked List");

                                DoubleLinkedList linkedList = new DoubleLinkedList();
                                linkedList.createLinkedList(0);
                                System.out.println("LinkedList created");
                                System.out.println("\n****Double Linkedlist operations****");
                                System.out.println("1.Add First");
                                System.out.println("2.Add Last");
                                System.out.println("3.Add At Position");
                                System.out.println("4.Delete First");
                                System.out.println("5.Delete Last");
                                System.out.println("6.Delete At Position");
                                System.out.println("7.Display");
                                System.out.print("Enter your option(1-7):");
                                int option2 = s.nextInt();
                                while (option2 >= 1 && option2 <= 7) {
                                    switch (option2) {
                                        case 1: {
                                            System.out.println("\n1.Adding element to linkedlist at beginning");
                                            System.out.print("Enter the data to add at first: ");
                                            int ele = s.nextInt();
                                            linkedList.addFirst(ele);
                                            System.out.println("Element added at first");
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("\n2.Adding element to linkedlist at ending");
                                            System.out.print("Enter the data to add at last: ");
                                            int ele = s.nextInt();
                                            linkedList.addLast(ele);
                                            System.out.println("Element added at last");
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("\n3.Adding element to linkedlist at position");
                                            System.out.print("Enter the data to add : ");
                                            int ele = s.nextInt();
                                            System.out.print("Enter the position to add: ");
                                            int position = s.nextInt();
                                            linkedList.addAtPosition(ele, position);

                                            break;
                                        }
                                        case 4: {
                                            System.out.println("\n4.Deleting element from linkedlist at beginning");
                                            linkedList.deleteFirst();
                                            System.out.println("Element deleted from first");
                                            break;
                                        }
                                        case 5: {
                                            System.out.println("\n5.Deleting element from linkedlist at ending");
                                            linkedList.deleteLast();
                                            System.out.println("Element deleted from last");
                                            break;
                                        }
                                        case 6: {
                                            System.out.println("\n6.Deleting element from linkedlist at position");
                                            System.out.print("Enter the position to delete: ");
                                            int position = s.nextInt();
                                            linkedList.deleteAtPosition(position);
                                            break;
                                        }
                                        case 7: {
                                            System.out.println("\n7.Displaying elements of linkedlist");
                                            linkedList.display();
                                            break;
                                        }
                                    }
                                    System.out.println("****Double Linkedlist operations****");
                                    System.out.println("1.Add First");
                                    System.out.println("2.Add Last");
                                    System.out.println("3.Add At Position");
                                    System.out.println("4.Delete First");
                                    System.out.println("5.Delete Last");
                                    System.out.println("6.Delete At Position");
                                    System.out.println("7.Display");
                                    System.out.print("Enter your option(1-7):");
                                    option2 = s.nextInt();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("\n1.3.Circular Linked List");
                                CircularLinkedList linkedList = new CircularLinkedList();
                                linkedList.createLinkedList();
                                System.out.println("LinkedList created");
                                System.out.println("\n****Circular Linkedlist operations****");
                                System.out.println("1.Add First");
                                System.out.println("2.Add Last");
                                System.out.println("3.Add At Position");
                                System.out.println("4.Delete First");
                                System.out.println("5.Delete Last");
                                System.out.println("6.Delete At Position");
                                System.out.println("7.Display");
                                System.out.print("Enter your option(1-7):");
                                int option2 = s.nextInt();
                                while (option2 >= 1 && option2 <= 7) {
                                    switch (option2) {
                                        case 1: {
                                            System.out.println("\n1.Adding element to linkedlist at beginning");
                                            System.out.print("Enter the data to add at first: ");
                                            int ele = s.nextInt();
                                            linkedList.addFirst(ele);
                                            System.out.println("Element added at first");
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("\n2.Adding element to linkedlist at ending");
                                            System.out.print("Enter the data to add at last: ");
                                            int ele = s.nextInt();
                                            linkedList.addLast(ele);
                                            System.out.println("Element added at last");
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("\n3.Adding element to linkedlist at position");
                                            System.out.print("Enter the data to add : ");
                                            int ele = s.nextInt();
                                            System.out.print("Enter the position to add: ");
                                            int position = s.nextInt();
                                            linkedList.addAtPosition(ele, position);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("\n4.Deleting element from linkedlist at beginning");
                                            linkedList.deleteFirst();
                                            System.out.println("Element deleted from first");
                                            break;
                                        }
                                        case 5: {
                                            System.out.println("\n5.Deleting element from linkedlist at ending");
                                            linkedList.deleteLast();
                                            System.out.println("Element deleted from last");
                                            break;
                                        }
                                        case 6: {
                                            System.out.println("\n6.Deleting element from linkedlist at position");
                                            System.out.print("Enter the position to delete: ");
                                            int position = s.nextInt();
                                            linkedList.deleteAtPosition(position);
                                            break;
                                        }
                                        case 7: {
                                            System.out.println("\n7.Displaying elements of linkedlist");
                                            linkedList.display();
                                            System.out.println();
                                            break;
                                        }
                                    }
                                    System.out.println("\n****Circular Linkedlist operations****");
                                    System.out.println("1.Add First");
                                    System.out.println("2.Add Last");
                                    System.out.println("3.Add At Position");
                                    System.out.println("4.Delete First");
                                    System.out.println("5.Delete Last");
                                    System.out.println("6.Delete At Position");
                                    System.out.println("7.Display");
                                    System.out.print("Enter your option(1-7):");
                                    option2 = s.nextInt();
                                }
                                break;
                            }
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        System.out.println("\n1.LINKED LIST RELATED PROGRAMS");
                        System.out.println("1.1.Singly Linked List");
                        System.out.println("1.2.Doubly Linked List");
                        System.out.println("1.3.Circular Linked List");

                        System.out.print("Enter your option(1-3):");
                        subOption = s.nextInt();
                    }
                    break;

                }

                case 2: {
                    System.out.println("\n2.STACK RELATED PROGRAMS");
                    StackArray st = new StackArray();
                    System.out.println("Stack created");
                    System.out.println("\n****Stack operations****");
                    System.out.println("1.Push");
                    System.out.println("2.Pop");
                    System.out.println("3.Peek");
                    System.out.println("4.Display");
                    System.out.println("5.Search");
                    System.out.println("6.Count of elements");
                    System.out.print("Enter your option(1-6):");
                    int option2 = s.nextInt();
                    while (option2 >= 1 && option2 <= 6) {
                        switch (option2) {
                            case 1: {
                                System.out.println("\n1.Push operation ");
                                System.out.print("Enter the data to Push ");
                                int ele = s.nextInt();
                                st.push(ele);
                                System.out.println("Element Pushed");
                                break;
                            }
                            case 2: {
                                System.out.println("\n2.Pop operation ");
                                int k = st.pop();
                                if (k != -1) {
                                    System.out.println("Element Popped: " + k);
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("\n3.Peek operation ");
                                int k = st.peek();
                                if (k != -1) {
                                    System.out.println("Element at top: " + k);
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("\n4.Display operation ");
                                st.display();
                                break;
                            }
                            case 5: {
                                System.out.println("\n5.Search operation ");
                                System.out.print("Enter the element to search: ");
                                int ele = s.nextInt();
                                st.search(ele);
                                break;
                            }
                            case 6: {
                                System.out.println("\n6.Count operation ");
                                System.out.println("Count of elements: " + st.getcount());
                                break;
                            }
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        System.out.println("\n****Stack operations****");
                        System.out.println("1.Push");
                        System.out.println("2.Pop");
                        System.out.println("3.Peek");
                        System.out.println("4.Display");
                        System.out.println("5.Search");
                        System.out.println("6.Count of elements");
                        System.out.print("Enter your option(1-6):");
                        option2 = s.nextInt();
                    }
                    break;
                }
                case 3: {
                    System.out.println("\n3.QUEUE RELATED PROGRAMS");
                    QueueArray q = new QueueArray();
                    System.out.println("Queue created");
                    System.out.println("\n****Queue operations****");
                    System.out.println("1.Enqueue");
                    System.out.println("2.Dequeue");
                    System.out.println("3.Peek");
                    System.out.println("4.Display");
                    System.out.print("Enter your option(1-4):");
                    int option2 = s.nextInt();
                    while (option2 >= 1 && option2 <= 4) {
                        switch (option2) {
                            case 1: {
                                System.out.println("\n1.Enqueue operation ");
                                System.out.print("Enter the data to Enqueue ");
                                int ele = s.nextInt();
                                q.enqueue(ele);
                                System.out.println("Element Pushed");
                                break;
                            }
                            case 2: {
                                System.out.println("\n2.Dequeue operation ");
                                int k = q.dequeue();
                                if (k != -1) {
                                    System.out.println("Element Dequeued: " + k);
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("\n3.Peek operation ");
                                int k = q.peek();
                                if (k != -1) {
                                    System.out.println("Element at front: " + k);
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("\n4.Display operation ");
                                q.display();
                                break;
                            }

                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        System.out.println("\n****Queue operations****");
                        System.out.println("1.Enqueue");
                        System.out.println("2.Dequeue");
                        System.out.println("3.Peek");
                        System.out.println("4.Display");
                        System.out.println("5.Search");
                        System.out.println("6.Count of elements");
                        System.out.print("Enter your option(1-6):");
                        option2 = s.nextInt();
                    }
                    break;
                }
                case 4: {
                    System.out.println("\n4.TREE RELATED PROGRAMS");
                    BSTTree bst = new BSTTree();
                    System.out.println("Binary Search Tree created");
                    System.out.println("\n****BST operations****");
                    System.out.println("1. Insert");
                    System.out.println("2. Search");
                    System.out.println("3. Delete");
                    System.out.println("4. Inorder Traversal");
                    System.out.println("5. Postorder Traversal");
                    System.out.println("6. Preorder Traversal");
                    System.out.print("Enter your option(1-6):");
                    int option2 = s.nextInt();
                    while (option2 >= 1 && option2 <= 6) {
                        switch (option2) {
                            case 1: {
                                System.out.println("\n1. Insert operation");
                                System.out.print("Enter the data to insert: ");
                                int ele = s.nextInt();
                                bst.insert(ele);
                                System.out.println("Element Inserted");
                                break;
                            }
                            case 2: {
                                System.out.println("\n2. Search operation");
                                System.out.print("Enter the data to search: ");
                                int ele = s.nextInt();
                                boolean found = bst.search(ele);
                                if (found) {
                                    System.out.println("Element found");
                                } else {
                                    System.out.println("Element not found");
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("\n3. Delete operation");
                                System.out.print("Enter the data to delete: ");
                                int ele = s.nextInt();
                                bst.delete(ele);
                                System.out.println("Element Deleted (if present)");
                                break;
                            }
                            case 4: {
                                System.out.println("\n4. Inorder Traversal");
                                bst.inorder();
                                break;
                            }
                            case 5: {
                                System.out.println("\n5. Postorder Traversal");
                                bst.postorder();
                                break;
                            }
                            case 6: {
                                System.out.println("\n6. Preorder Traversal");
                                bst.preorder();
                                break;
                            }
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        System.out.println("\n****BST operations****");
                        System.out.println("1. Insert");
                        System.out.println("2. Search");
                        System.out.println("3. Delete");
                        System.out.println("4. Inorder Traversal");
                        System.out.println("5. Postorder Traversal");
                        System.out.println("6. Preorder Traversal");
                        System.out.print("Enter your option(1-6):");
                        option2 = s.nextInt();
                    }
                    break;
                }      
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("\t\t\t\t\t*****DataStructures PROGRAMS*****\t\t\t\t\t\n");
            System.out.println("1.LINKED LIST RELATED PROGRAMS");
            System.out.println("2.STACK RELATED PROGRAMS");
            System.out.println("3.QUEUE RELATED PROGRAMS");
            System.out.println("4.TREE RELATED PROGRAMS");
            System.out.print("Enter your option(1-4):");
            option = s.nextInt();
        }
        s.close();

    }

}
