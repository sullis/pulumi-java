// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.AttestationArgs;
import java.util.Objects;


/**
 * Details of an attestation occurrence.
 * 
 */
public final class DetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetailsArgs Empty = new DetailsArgs();

    /**
     * Attestation for the resource.
     * 
     */
    @Import(name="attestation", required=true)
    private Output<AttestationArgs> attestation;

    /**
     * @return Attestation for the resource.
     * 
     */
    public Output<AttestationArgs> attestation() {
        return this.attestation;
    }

    private DetailsArgs() {}

    private DetailsArgs(DetailsArgs $) {
        this.attestation = $.attestation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetailsArgs $;

        public Builder() {
            $ = new DetailsArgs();
        }

        public Builder(DetailsArgs defaults) {
            $ = new DetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestation Attestation for the resource.
         * 
         * @return builder
         * 
         */
        public Builder attestation(Output<AttestationArgs> attestation) {
            $.attestation = attestation;
            return this;
        }

        /**
         * @param attestation Attestation for the resource.
         * 
         * @return builder
         * 
         */
        public Builder attestation(AttestationArgs attestation) {
            return attestation(Output.of(attestation));
        }

        public DetailsArgs build() {
            $.attestation = Objects.requireNonNull($.attestation, "expected parameter 'attestation' to be non-null");
            return $;
        }
    }

}
