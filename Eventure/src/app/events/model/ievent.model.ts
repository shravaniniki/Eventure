export interface IEvent {
    id:number;
    name:string;
    organizer:string;
    email:string;
    location:string;
    date:string;
    attendees:String;
    mode:String;
    description?:string;
    showDescription?: boolean;
}
