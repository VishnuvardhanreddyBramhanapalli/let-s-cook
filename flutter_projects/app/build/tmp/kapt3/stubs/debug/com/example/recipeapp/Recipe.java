package com.example.recipeapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/recipeapp/Recipe;", "", "img", "", "tittle", "des", "ing", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getDes", "setDes", "getImg", "setImg", "getIng", "setIng", "getTittle", "setTittle", "uid", "", "app_debug"})
@androidx.room.Entity(tableName = "recipe")
public final class Recipe {
    @org.jetbrains.annotations.NotNull
    private java.lang.String img;
    @org.jetbrains.annotations.NotNull
    private java.lang.String tittle;
    @org.jetbrains.annotations.NotNull
    private java.lang.String des;
    @org.jetbrains.annotations.NotNull
    private java.lang.String ing;
    @org.jetbrains.annotations.NotNull
    private java.lang.String category;
    @kotlin.jvm.JvmField
    @androidx.room.PrimaryKey(autoGenerate = true)
    public int uid = 0;
    
    public Recipe(@org.jetbrains.annotations.NotNull
    java.lang.String img, @org.jetbrains.annotations.NotNull
    java.lang.String tittle, @org.jetbrains.annotations.NotNull
    java.lang.String des, @org.jetbrains.annotations.NotNull
    java.lang.String ing, @org.jetbrains.annotations.NotNull
    java.lang.String category) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImg() {
        return null;
    }
    
    public final void setImg(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTittle() {
        return null;
    }
    
    public final void setTittle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDes() {
        return null;
    }
    
    public final void setDes(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIng() {
        return null;
    }
    
    public final void setIng(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}