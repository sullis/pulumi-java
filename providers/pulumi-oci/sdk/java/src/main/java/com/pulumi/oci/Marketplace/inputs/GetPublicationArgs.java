// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPublicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicationArgs Empty = new GetPublicationArgs();

    /**
     * The unique identifier for the publication.
     * 
     */
    @Import(name="publicationId", required=true)
    private Output<String> publicationId;

    /**
     * @return The unique identifier for the publication.
     * 
     */
    public Output<String> publicationId() {
        return this.publicationId;
    }

    private GetPublicationArgs() {}

    private GetPublicationArgs(GetPublicationArgs $) {
        this.publicationId = $.publicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicationArgs $;

        public Builder() {
            $ = new GetPublicationArgs();
        }

        public Builder(GetPublicationArgs defaults) {
            $ = new GetPublicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicationId The unique identifier for the publication.
         * 
         * @return builder
         * 
         */
        public Builder publicationId(Output<String> publicationId) {
            $.publicationId = publicationId;
            return this;
        }

        /**
         * @param publicationId The unique identifier for the publication.
         * 
         * @return builder
         * 
         */
        public Builder publicationId(String publicationId) {
            return publicationId(Output.of(publicationId));
        }

        public GetPublicationArgs build() {
            $.publicationId = Objects.requireNonNull($.publicationId, "expected parameter 'publicationId' to be non-null");
            return $;
        }
    }

}
