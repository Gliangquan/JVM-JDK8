// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Contacts.proto

package com.liangquan.InterviewQuestion.A03_protoUsersPlus.Contacts;

public final class ContactsOuterClass {
  private ContactsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_UserPlus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_UserPlus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_UserPlus_Phone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_UserPlus_Phone_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_Contacts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_Contacts_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Contacts.proto\022\006proto3\"e\n\010UserPlus\022\014\n\004" +
      "name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022%\n\005phone\030\003 \003(\0132\026" +
      ".proto3.UserPlus.Phone\032\027\n\005Phone\022\016\n\006numbe" +
      "r\030\001 \001(\t\"+\n\010Contacts\022\037\n\005users\030\001 \003(\0132\020.pro" +
      "to3.UserPlusB?\n;com.liangquan.InterviewQ" +
      "uestion.A03_protoUsersPlus.ContactsP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto3_UserPlus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto3_UserPlus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_UserPlus_descriptor,
        new java.lang.String[] { "Name", "Age", "Phone", });
    internal_static_proto3_UserPlus_Phone_descriptor =
      internal_static_proto3_UserPlus_descriptor.getNestedTypes().get(0);
    internal_static_proto3_UserPlus_Phone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_UserPlus_Phone_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_proto3_Contacts_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto3_Contacts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_Contacts_descriptor,
        new java.lang.String[] { "Users", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
