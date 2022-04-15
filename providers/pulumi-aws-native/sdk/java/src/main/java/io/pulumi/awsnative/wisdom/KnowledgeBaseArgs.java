// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.wisdom.enums.KnowledgeBaseType;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseRenderingConfigurationArgs;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseServerSideEncryptionConfigurationArgs;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseSourceConfigurationArgs;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KnowledgeBaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final KnowledgeBaseArgs Empty = new KnowledgeBaseArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="knowledgeBaseType", required=true)
      private final Output<KnowledgeBaseType> knowledgeBaseType;

    public Output<KnowledgeBaseType> knowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="renderingConfiguration")
      private final @Nullable Output<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration;

    public Output<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration() {
        return this.renderingConfiguration == null ? Codegen.empty() : this.renderingConfiguration;
    }

    @Import(name="serverSideEncryptionConfiguration")
      private final @Nullable Output<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    public Output<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration == null ? Codegen.empty() : this.serverSideEncryptionConfiguration;
    }

    @Import(name="sourceConfiguration")
      private final @Nullable Output<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration;

    public Output<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration() {
        return this.sourceConfiguration == null ? Codegen.empty() : this.sourceConfiguration;
    }

    @Import(name="tags")
      private final @Nullable Output<List<KnowledgeBaseTagArgs>> tags;

    public Output<List<KnowledgeBaseTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public KnowledgeBaseArgs(
        @Nullable Output<String> description,
        Output<KnowledgeBaseType> knowledgeBaseType,
        @Nullable Output<String> name,
        @Nullable Output<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration,
        @Nullable Output<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration,
        @Nullable Output<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration,
        @Nullable Output<List<KnowledgeBaseTagArgs>> tags) {
        this.description = description;
        this.knowledgeBaseType = Objects.requireNonNull(knowledgeBaseType, "expected parameter 'knowledgeBaseType' to be non-null");
        this.name = name;
        this.renderingConfiguration = renderingConfiguration;
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        this.sourceConfiguration = sourceConfiguration;
        this.tags = tags;
    }

    private KnowledgeBaseArgs() {
        this.description = Codegen.empty();
        this.knowledgeBaseType = Codegen.empty();
        this.name = Codegen.empty();
        this.renderingConfiguration = Codegen.empty();
        this.serverSideEncryptionConfiguration = Codegen.empty();
        this.sourceConfiguration = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<KnowledgeBaseType> knowledgeBaseType;
        private @Nullable Output<String> name;
        private @Nullable Output<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration;
        private @Nullable Output<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;
        private @Nullable Output<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration;
        private @Nullable Output<List<KnowledgeBaseTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.knowledgeBaseType = defaults.knowledgeBaseType;
    	      this.name = defaults.name;
    	      this.renderingConfiguration = defaults.renderingConfiguration;
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
    	      this.sourceConfiguration = defaults.sourceConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder knowledgeBaseType(Output<KnowledgeBaseType> knowledgeBaseType) {
            this.knowledgeBaseType = Objects.requireNonNull(knowledgeBaseType);
            return this;
        }
        public Builder knowledgeBaseType(KnowledgeBaseType knowledgeBaseType) {
            this.knowledgeBaseType = Output.of(Objects.requireNonNull(knowledgeBaseType));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder renderingConfiguration(@Nullable Output<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration) {
            this.renderingConfiguration = renderingConfiguration;
            return this;
        }
        public Builder renderingConfiguration(@Nullable KnowledgeBaseRenderingConfigurationArgs renderingConfiguration) {
            this.renderingConfiguration = Codegen.ofNullable(renderingConfiguration);
            return this;
        }
        public Builder serverSideEncryptionConfiguration(@Nullable Output<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }
        public Builder serverSideEncryptionConfiguration(@Nullable KnowledgeBaseServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Codegen.ofNullable(serverSideEncryptionConfiguration);
            return this;
        }
        public Builder sourceConfiguration(@Nullable Output<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration) {
            this.sourceConfiguration = sourceConfiguration;
            return this;
        }
        public Builder sourceConfiguration(@Nullable KnowledgeBaseSourceConfigurationArgs sourceConfiguration) {
            this.sourceConfiguration = Codegen.ofNullable(sourceConfiguration);
            return this;
        }
        public Builder tags(@Nullable Output<List<KnowledgeBaseTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<KnowledgeBaseTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(KnowledgeBaseTagArgs... tags) {
            return tags(List.of(tags));
        }        public KnowledgeBaseArgs build() {
            return new KnowledgeBaseArgs(description, knowledgeBaseType, name, renderingConfiguration, serverSideEncryptionConfiguration, sourceConfiguration, tags);
        }
    }
}
