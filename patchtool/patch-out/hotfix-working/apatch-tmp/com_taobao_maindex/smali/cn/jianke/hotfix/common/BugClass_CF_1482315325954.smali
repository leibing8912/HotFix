.class public Lcn/jianke/hotfix/common/BugClass_CF_1482315325954;
.super Ljava/lang/Object;
.source "BugClass.java"


# virtual methods
.method public getB()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/alipay/euler/andfix/annotation/MethodReplace;
        clazz = "cn.jianke.hotfix.common.BugClass"
        method = "getB"
    .end annotation

    .prologue
    check-cast p0, Lcn/jianke/hotfix/common/BugClass;
    .line 36
    const-string v0, "bug\u5df2\u4fee\u590d"

    .line 37
    .local v0, "b":Ljava/lang/String;
    return-object v0
.end method
