package domain;

public class Comment {
   private boolean canComment;
   private boolean canCloseComments;
   private boolean canOpenComments;
   private int commentId;

   public int getCommentId() {
      return commentId;
   }

   public void setCommentId(int commentId) {
      this.commentId = commentId;
   }

   public boolean isCanComment() {
      return canComment;
   }

   public void setCanComment(boolean canComment) {
      this.canComment = canComment;
   }

   public boolean isCanCloseComments() {
      return canCloseComments;
   }

   public void setCanCloseComments(boolean canCloseComments) {
      this.canCloseComments = canCloseComments;
   }

   public boolean isCanOpenComments() {
      return canOpenComments;
   }

   public void setCanOpenComments(boolean canOpenComments) {
      this.canOpenComments = canOpenComments;
   }
}
