// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Utente.proto

package com.gcalsolaro.grpc.artifact.model;

public interface UtenteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gcalsolaro.grpc.artifact.model.Utente)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 idUtente = 1;</code>
   */
  int getIdUtente();

  /**
   * <code>string cComune = 2;</code>
   */
  java.lang.String getCComune();
  /**
   * <code>string cComune = 2;</code>
   */
  com.google.protobuf.ByteString
      getCComuneBytes();

  /**
   * <code>string cFiscale = 3;</code>
   */
  java.lang.String getCFiscale();
  /**
   * <code>string cFiscale = 3;</code>
   */
  com.google.protobuf.ByteString
      getCFiscaleBytes();

  /**
   * <code>string cognome = 4;</code>
   */
  java.lang.String getCognome();
  /**
   * <code>string cognome = 4;</code>
   */
  com.google.protobuf.ByteString
      getCognomeBytes();

  /**
   * <code>string descrizioneComune = 5;</code>
   */
  java.lang.String getDescrizioneComune();
  /**
   * <code>string descrizioneComune = 5;</code>
   */
  com.google.protobuf.ByteString
      getDescrizioneComuneBytes();

  /**
   * <code>.google.protobuf.Timestamp dtNascita = 6;</code>
   */
  boolean hasDtNascita();
  /**
   * <code>.google.protobuf.Timestamp dtNascita = 6;</code>
   */
  com.google.protobuf.Timestamp getDtNascita();
  /**
   * <code>.google.protobuf.Timestamp dtNascita = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDtNascitaOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp dtOraIns = 7;</code>
   */
  boolean hasDtOraIns();
  /**
   * <code>.google.protobuf.Timestamp dtOraIns = 7;</code>
   */
  com.google.protobuf.Timestamp getDtOraIns();
  /**
   * <code>.google.protobuf.Timestamp dtOraIns = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDtOraInsOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp dtOraMod = 8;</code>
   */
  boolean hasDtOraMod();
  /**
   * <code>.google.protobuf.Timestamp dtOraMod = 8;</code>
   */
  com.google.protobuf.Timestamp getDtOraMod();
  /**
   * <code>.google.protobuf.Timestamp dtOraMod = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDtOraModOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp dtRegistrazione = 9;</code>
   */
  boolean hasDtRegistrazione();
  /**
   * <code>.google.protobuf.Timestamp dtRegistrazione = 9;</code>
   */
  com.google.protobuf.Timestamp getDtRegistrazione();
  /**
   * <code>.google.protobuf.Timestamp dtRegistrazione = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDtRegistrazioneOrBuilder();

  /**
   * <code>string email = 10;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 10;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string nome = 11;</code>
   */
  java.lang.String getNome();
  /**
   * <code>string nome = 11;</code>
   */
  com.google.protobuf.ByteString
      getNomeBytes();

  /**
   * <code>string prov = 12;</code>
   */
  java.lang.String getProv();
  /**
   * <code>string prov = 12;</code>
   */
  com.google.protobuf.ByteString
      getProvBytes();

  /**
   * <code>string stato = 13;</code>
   */
  java.lang.String getStato();
  /**
   * <code>string stato = 13;</code>
   */
  com.google.protobuf.ByteString
      getStatoBytes();

  /**
   * <code>string useridIns = 14;</code>
   */
  java.lang.String getUseridIns();
  /**
   * <code>string useridIns = 14;</code>
   */
  com.google.protobuf.ByteString
      getUseridInsBytes();

  /**
   * <code>string useridMod = 15;</code>
   */
  java.lang.String getUseridMod();
  /**
   * <code>string useridMod = 15;</code>
   */
  com.google.protobuf.ByteString
      getUseridModBytes();
}