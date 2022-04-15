// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class PipelineArtifactStoreEncryptionKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArtifactStoreEncryptionKeyGetArgs Empty = new PipelineArtifactStoreEncryptionKeyGetArgs();

    /**
     * The KMS key ARN or ID
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * The type of key; currently only `KMS` is supported
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public PipelineArtifactStoreEncryptionKeyGetArgs(
        Output<String> id,
        Output<String> type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PipelineArtifactStoreEncryptionKeyGetArgs() {
        this.id = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArtifactStoreEncryptionKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArtifactStoreEncryptionKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public PipelineArtifactStoreEncryptionKeyGetArgs build() {
            return new PipelineArtifactStoreEncryptionKeyGetArgs(id, type);
        }
    }
}
