package Task007.Interfaces;

import Task007.Classes.Comment;

public interface ActionsWithComments {
    void leaveComment(Comment comment);
    void deleteComment(Comment comment);
    void editComment(Comment comment);
    void replyToComment(Comment comment);
}
