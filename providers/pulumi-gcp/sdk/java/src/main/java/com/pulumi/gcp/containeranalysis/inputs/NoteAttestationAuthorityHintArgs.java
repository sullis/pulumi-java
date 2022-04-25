// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NoteAttestationAuthorityHintArgs extends com.pulumi.resources.ResourceArgs {

    public static final NoteAttestationAuthorityHintArgs Empty = new NoteAttestationAuthorityHintArgs();

    /**
     * The human readable name of this Attestation Authority, for
     * example &#34;qa&#34;.
     * 
     */
    @Import(name="humanReadableName", required=true)
    private Output<String> humanReadableName;

    /**
     * @return The human readable name of this Attestation Authority, for
     * example &#34;qa&#34;.
     * 
     */
    public Output<String> humanReadableName() {
        return this.humanReadableName;
    }

    private NoteAttestationAuthorityHintArgs() {}

    private NoteAttestationAuthorityHintArgs(NoteAttestationAuthorityHintArgs $) {
        this.humanReadableName = $.humanReadableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NoteAttestationAuthorityHintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NoteAttestationAuthorityHintArgs $;

        public Builder() {
            $ = new NoteAttestationAuthorityHintArgs();
        }

        public Builder(NoteAttestationAuthorityHintArgs defaults) {
            $ = new NoteAttestationAuthorityHintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param humanReadableName The human readable name of this Attestation Authority, for
         * example &#34;qa&#34;.
         * 
         * @return builder
         * 
         */
        public Builder humanReadableName(Output<String> humanReadableName) {
            $.humanReadableName = humanReadableName;
            return this;
        }

        /**
         * @param humanReadableName The human readable name of this Attestation Authority, for
         * example &#34;qa&#34;.
         * 
         * @return builder
         * 
         */
        public Builder humanReadableName(String humanReadableName) {
            return humanReadableName(Output.of(humanReadableName));
        }

        public NoteAttestationAuthorityHintArgs build() {
            $.humanReadableName = Objects.requireNonNull($.humanReadableName, "expected parameter 'humanReadableName' to be non-null");
            return $;
        }
    }

}
