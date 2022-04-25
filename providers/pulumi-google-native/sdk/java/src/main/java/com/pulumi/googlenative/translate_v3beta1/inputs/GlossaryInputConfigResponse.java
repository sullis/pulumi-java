// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.translate_v3beta1.inputs.GcsSourceResponse;
import java.util.Objects;


/**
 * Input configuration for glossaries.
 * 
 */
public final class GlossaryInputConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GlossaryInputConfigResponse Empty = new GlossaryInputConfigResponse();

    /**
     * Google Cloud Storage location of glossary data. File format is determined based on the filename extension. API returns [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file formats. Wildcards are not allowed. This must be a single file in one of the following formats: For unidirectional glossaries: - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated. The first column is source text. The second column is target text. The file must not contain headers. That is, the first row is data, not column names. - TMX (`.tmx`): TMX file with parallel data defining source/target term pairs. For equivalent term sets glossaries: - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms in multiple languages. The format is defined for Google Translation Toolkit and documented in [Use a glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * 
     */
    @Import(name="gcsSource", required=true)
    private GcsSourceResponse gcsSource;

    /**
     * @return Google Cloud Storage location of glossary data. File format is determined based on the filename extension. API returns [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file formats. Wildcards are not allowed. This must be a single file in one of the following formats: For unidirectional glossaries: - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated. The first column is source text. The second column is target text. The file must not contain headers. That is, the first row is data, not column names. - TMX (`.tmx`): TMX file with parallel data defining source/target term pairs. For equivalent term sets glossaries: - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms in multiple languages. The format is defined for Google Translation Toolkit and documented in [Use a glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * 
     */
    public GcsSourceResponse gcsSource() {
        return this.gcsSource;
    }

    private GlossaryInputConfigResponse() {}

    private GlossaryInputConfigResponse(GlossaryInputConfigResponse $) {
        this.gcsSource = $.gcsSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlossaryInputConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlossaryInputConfigResponse $;

        public Builder() {
            $ = new GlossaryInputConfigResponse();
        }

        public Builder(GlossaryInputConfigResponse defaults) {
            $ = new GlossaryInputConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcsSource Google Cloud Storage location of glossary data. File format is determined based on the filename extension. API returns [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file formats. Wildcards are not allowed. This must be a single file in one of the following formats: For unidirectional glossaries: - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated. The first column is source text. The second column is target text. The file must not contain headers. That is, the first row is data, not column names. - TMX (`.tmx`): TMX file with parallel data defining source/target term pairs. For equivalent term sets glossaries: - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms in multiple languages. The format is defined for Google Translation Toolkit and documented in [Use a glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
         * 
         * @return builder
         * 
         */
        public Builder gcsSource(GcsSourceResponse gcsSource) {
            $.gcsSource = gcsSource;
            return this;
        }

        public GlossaryInputConfigResponse build() {
            $.gcsSource = Objects.requireNonNull($.gcsSource, "expected parameter 'gcsSource' to be non-null");
            return $;
        }
    }

}
