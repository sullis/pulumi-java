// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.EnvelopeArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.InTotoStatementArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deprecated. Prefer to use a regular Occurrence, and populate the Envelope at the top level of the Occurrence.
 * 
 */
public final class DSSEAttestationOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DSSEAttestationOccurrenceArgs Empty = new DSSEAttestationOccurrenceArgs();

    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    @Import(name="envelope")
    private @Nullable Output<EnvelopeArgs> envelope;

    /**
     * @return If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    public Optional<Output<EnvelopeArgs>> envelope() {
        return Optional.ofNullable(this.envelope);
    }

    @Import(name="statement")
    private @Nullable Output<InTotoStatementArgs> statement;

    public Optional<Output<InTotoStatementArgs>> statement() {
        return Optional.ofNullable(this.statement);
    }

    private DSSEAttestationOccurrenceArgs() {}

    private DSSEAttestationOccurrenceArgs(DSSEAttestationOccurrenceArgs $) {
        this.envelope = $.envelope;
        this.statement = $.statement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DSSEAttestationOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DSSEAttestationOccurrenceArgs $;

        public Builder() {
            $ = new DSSEAttestationOccurrenceArgs();
        }

        public Builder(DSSEAttestationOccurrenceArgs defaults) {
            $ = new DSSEAttestationOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param envelope If doing something security critical, make sure to verify the signatures in this metadata.
         * 
         * @return builder
         * 
         */
        public Builder envelope(@Nullable Output<EnvelopeArgs> envelope) {
            $.envelope = envelope;
            return this;
        }

        /**
         * @param envelope If doing something security critical, make sure to verify the signatures in this metadata.
         * 
         * @return builder
         * 
         */
        public Builder envelope(EnvelopeArgs envelope) {
            return envelope(Output.of(envelope));
        }

        public Builder statement(@Nullable Output<InTotoStatementArgs> statement) {
            $.statement = statement;
            return this;
        }

        public Builder statement(InTotoStatementArgs statement) {
            return statement(Output.of(statement));
        }

        public DSSEAttestationOccurrenceArgs build() {
            return $;
        }
    }

}
