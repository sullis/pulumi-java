// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.EnvelopeArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.InTotoStatementArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deprecated. Prefer to use a regular Occurrence, and populate the Envelope at the top level of the Occurrence.
 * 
 */
public final class DSSEAttestationOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DSSEAttestationOccurrenceArgs Empty = new DSSEAttestationOccurrenceArgs();

    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    @InputImport(name="envelope")
      private final @Nullable Input<EnvelopeArgs> envelope;

    public Input<EnvelopeArgs> getEnvelope() {
        return this.envelope == null ? Input.empty() : this.envelope;
    }

    @InputImport(name="statement")
      private final @Nullable Input<InTotoStatementArgs> statement;

    public Input<InTotoStatementArgs> getStatement() {
        return this.statement == null ? Input.empty() : this.statement;
    }

    public DSSEAttestationOccurrenceArgs(
        @Nullable Input<EnvelopeArgs> envelope,
        @Nullable Input<InTotoStatementArgs> statement) {
        this.envelope = envelope;
        this.statement = statement;
    }

    private DSSEAttestationOccurrenceArgs() {
        this.envelope = Input.empty();
        this.statement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnvelopeArgs> envelope;
        private @Nullable Input<InTotoStatementArgs> statement;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envelope = defaults.envelope;
    	      this.statement = defaults.statement;
        }

        public Builder setEnvelope(@Nullable Input<EnvelopeArgs> envelope) {
            this.envelope = envelope;
            return this;
        }

        public Builder setEnvelope(@Nullable EnvelopeArgs envelope) {
            this.envelope = Input.ofNullable(envelope);
            return this;
        }

        public Builder setStatement(@Nullable Input<InTotoStatementArgs> statement) {
            this.statement = statement;
            return this;
        }

        public Builder setStatement(@Nullable InTotoStatementArgs statement) {
            this.statement = Input.ofNullable(statement);
            return this;
        }
        public DSSEAttestationOccurrenceArgs build() {
            return new DSSEAttestationOccurrenceArgs(envelope, statement);
        }
    }
}