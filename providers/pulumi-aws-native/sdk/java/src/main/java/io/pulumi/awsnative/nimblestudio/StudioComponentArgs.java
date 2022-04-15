// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.nimblestudio.enums.StudioComponentSubtype;
import io.pulumi.awsnative.nimblestudio.enums.StudioComponentType;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentInitializationScriptArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentScriptParameterKeyValueArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentTagsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentArgs Empty = new StudioComponentArgs();

    @Import(name="configuration")
      private final @Nullable Output<StudioComponentConfigurationArgs> configuration;

    public Output<StudioComponentConfigurationArgs> configuration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    /**
     * <p>The description.</p>
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * <p>The EC2 security groups that control access to the studio component.</p>
     * 
     */
    @Import(name="ec2SecurityGroupIds")
      private final @Nullable Output<List<String>> ec2SecurityGroupIds;

    public Output<List<String>> ec2SecurityGroupIds() {
        return this.ec2SecurityGroupIds == null ? Codegen.empty() : this.ec2SecurityGroupIds;
    }

    /**
     * <p>Initialization scripts for studio components.</p>
     * 
     */
    @Import(name="initializationScripts")
      private final @Nullable Output<List<StudioComponentInitializationScriptArgs>> initializationScripts;

    public Output<List<StudioComponentInitializationScriptArgs>> initializationScripts() {
        return this.initializationScripts == null ? Codegen.empty() : this.initializationScripts;
    }

    /**
     * <p>The name for the studio component.</p>
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * <p>Parameters for the studio component scripts.</p>
     * 
     */
    @Import(name="scriptParameters")
      private final @Nullable Output<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters;

    public Output<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters() {
        return this.scriptParameters == null ? Codegen.empty() : this.scriptParameters;
    }

    /**
     * <p>The studioId. </p>
     * 
     */
    @Import(name="studioId", required=true)
      private final Output<String> studioId;

    public Output<String> studioId() {
        return this.studioId;
    }

    @Import(name="subtype")
      private final @Nullable Output<StudioComponentSubtype> subtype;

    public Output<StudioComponentSubtype> subtype() {
        return this.subtype == null ? Codegen.empty() : this.subtype;
    }

    @Import(name="tags")
      private final @Nullable Output<StudioComponentTagsArgs> tags;

    public Output<StudioComponentTagsArgs> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="type", required=true)
      private final Output<StudioComponentType> type;

    public Output<StudioComponentType> type() {
        return this.type;
    }

    public StudioComponentArgs(
        @Nullable Output<StudioComponentConfigurationArgs> configuration,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> ec2SecurityGroupIds,
        @Nullable Output<List<StudioComponentInitializationScriptArgs>> initializationScripts,
        @Nullable Output<String> name,
        @Nullable Output<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters,
        Output<String> studioId,
        @Nullable Output<StudioComponentSubtype> subtype,
        @Nullable Output<StudioComponentTagsArgs> tags,
        Output<StudioComponentType> type) {
        this.configuration = configuration;
        this.description = description;
        this.ec2SecurityGroupIds = ec2SecurityGroupIds;
        this.initializationScripts = initializationScripts;
        this.name = name;
        this.scriptParameters = scriptParameters;
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
        this.subtype = subtype;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StudioComponentArgs() {
        this.configuration = Codegen.empty();
        this.description = Codegen.empty();
        this.ec2SecurityGroupIds = Codegen.empty();
        this.initializationScripts = Codegen.empty();
        this.name = Codegen.empty();
        this.scriptParameters = Codegen.empty();
        this.studioId = Codegen.empty();
        this.subtype = Codegen.empty();
        this.tags = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StudioComponentConfigurationArgs> configuration;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> ec2SecurityGroupIds;
        private @Nullable Output<List<StudioComponentInitializationScriptArgs>> initializationScripts;
        private @Nullable Output<String> name;
        private @Nullable Output<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters;
        private Output<String> studioId;
        private @Nullable Output<StudioComponentSubtype> subtype;
        private @Nullable Output<StudioComponentTagsArgs> tags;
        private Output<StudioComponentType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.ec2SecurityGroupIds = defaults.ec2SecurityGroupIds;
    	      this.initializationScripts = defaults.initializationScripts;
    	      this.name = defaults.name;
    	      this.scriptParameters = defaults.scriptParameters;
    	      this.studioId = defaults.studioId;
    	      this.subtype = defaults.subtype;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder configuration(@Nullable Output<StudioComponentConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable StudioComponentConfigurationArgs configuration) {
            this.configuration = Codegen.ofNullable(configuration);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ec2SecurityGroupIds(@Nullable Output<List<String>> ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds = ec2SecurityGroupIds;
            return this;
        }
        public Builder ec2SecurityGroupIds(@Nullable List<String> ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds = Codegen.ofNullable(ec2SecurityGroupIds);
            return this;
        }
        public Builder ec2SecurityGroupIds(String... ec2SecurityGroupIds) {
            return ec2SecurityGroupIds(List.of(ec2SecurityGroupIds));
        }
        public Builder initializationScripts(@Nullable Output<List<StudioComponentInitializationScriptArgs>> initializationScripts) {
            this.initializationScripts = initializationScripts;
            return this;
        }
        public Builder initializationScripts(@Nullable List<StudioComponentInitializationScriptArgs> initializationScripts) {
            this.initializationScripts = Codegen.ofNullable(initializationScripts);
            return this;
        }
        public Builder initializationScripts(StudioComponentInitializationScriptArgs... initializationScripts) {
            return initializationScripts(List.of(initializationScripts));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder scriptParameters(@Nullable Output<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }
        public Builder scriptParameters(@Nullable List<StudioComponentScriptParameterKeyValueArgs> scriptParameters) {
            this.scriptParameters = Codegen.ofNullable(scriptParameters);
            return this;
        }
        public Builder scriptParameters(StudioComponentScriptParameterKeyValueArgs... scriptParameters) {
            return scriptParameters(List.of(scriptParameters));
        }
        public Builder studioId(Output<String> studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }
        public Builder studioId(String studioId) {
            this.studioId = Output.of(Objects.requireNonNull(studioId));
            return this;
        }
        public Builder subtype(@Nullable Output<StudioComponentSubtype> subtype) {
            this.subtype = subtype;
            return this;
        }
        public Builder subtype(@Nullable StudioComponentSubtype subtype) {
            this.subtype = Codegen.ofNullable(subtype);
            return this;
        }
        public Builder tags(@Nullable Output<StudioComponentTagsArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable StudioComponentTagsArgs tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder type(Output<StudioComponentType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(StudioComponentType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public StudioComponentArgs build() {
            return new StudioComponentArgs(configuration, description, ec2SecurityGroupIds, initializationScripts, name, scriptParameters, studioId, subtype, tags, type);
        }
    }
}
