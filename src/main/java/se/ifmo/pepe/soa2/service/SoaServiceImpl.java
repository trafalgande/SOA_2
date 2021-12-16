package se.ifmo.pepe.soa2.service;

import dto.music_band.request.AddSingleRequest;
import dto.music_band.response.MusicBandView;
import se.ifmo.pepe.soaclientlibs.service.SoaServiceClient;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.Objects;

@RequestScoped
public class SoaServiceImpl implements SoaService {

    @Inject
    private SoaServiceClient soaServiceClient;

    @Override
    public MusicBandView addSingleToBand(long bandId, AddSingleRequest request) {
        return soaServiceClient.addSingleToBand(bandId,
                Objects.requireNonNull(request.getTitle())
        );
    }

    @Override
    public MusicBandView removeParticipantFromBand(long bandId) {
        return soaServiceClient.removeParticipantFromBand(bandId);
    }
}

