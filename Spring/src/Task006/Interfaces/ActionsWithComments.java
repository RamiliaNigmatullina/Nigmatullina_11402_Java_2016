package Task006.Interfaces;

import Task006.Classes.Comment;

public interface ActionsWithComments {
    void leaveComment(Comment comment);
    void deleteComment(Comment comment);
    void editComment(Comment comment);
    void replyToComment(Comment comment);
}
