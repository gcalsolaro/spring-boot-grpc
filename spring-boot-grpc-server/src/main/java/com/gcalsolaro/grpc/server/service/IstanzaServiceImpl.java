package com.gcalsolaro.grpc.server.service;

import com.gcalsolaro.grpc.model.Documento;
import com.gcalsolaro.grpc.model.Istanza;
import com.gcalsolaro.grpc.model.IstanzaRequest;
import com.gcalsolaro.grpc.model.IstanzaResponse;
import com.gcalsolaro.grpc.model.IstanzaServiceGrpc.IstanzaServiceImplBase;
import com.gcalsolaro.grpc.model.Utente;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class IstanzaServiceImpl extends IstanzaServiceImplBase {

	@Override
	public void recuperaIstanzaApi(IstanzaRequest request, StreamObserver<IstanzaResponse> responseObserver) {
		
		// Fill User Object
		Utente utente = Utente.newBuilder()
				.setNome("Mario")
				.setCognome("Rossi")
				.setDescrizioneComune("Roma")
				.setUseridIns("System")
				.setStato("ITALIA")
				.setEmail("mario.rossi@fakemail.it")
				.build();
		
		// Fill Doc Object
		Documento doc1 = Documento.newBuilder()
				.setNomeFile("File_1.docx")
				.setDescrizione("File di esempio WORD")
				.build();
		
		Documento doc2 = Documento.newBuilder()
				.setNomeFile("File_2.pdf")
				.setDescrizione("File di esempio PDF")
				.build();
		
		// Fill Istanza Object
		Istanza istanzaGrpc = Istanza.newBuilder()
				.setDenominazione("Istanza di prova")
				.setUtente(utente)
				.addDocumenti(doc1)
				.addDocumenti(doc2)
				.build();

		IstanzaResponse response = IstanzaResponse.newBuilder()
				.setEsito(true)
				.setIstanza(istanzaGrpc).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
