// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.enums.StudioComponentType;
import io.pulumi.awsnative.nimblestudio.outputs.StudioComponentConfiguration;
import io.pulumi.awsnative.nimblestudio.outputs.StudioComponentInitializationScript;
import io.pulumi.awsnative.nimblestudio.outputs.StudioComponentScriptParameterKeyValue;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStudioComponentResult {
    private final @Nullable StudioComponentConfiguration configuration;
    /**
     * <p>The description.</p>
     * 
     */
    private final @Nullable String description;
    /**
     * <p>The EC2 security groups that control access to the studio component.</p>
     * 
     */
    private final @Nullable List<String> ec2SecurityGroupIds;
    /**
     * <p>Initialization scripts for studio components.</p>
     * 
     */
    private final @Nullable List<StudioComponentInitializationScript> initializationScripts;
    /**
     * <p>The name for the studio component.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>Parameters for the studio component scripts.</p>
     * 
     */
    private final @Nullable List<StudioComponentScriptParameterKeyValue> scriptParameters;
    private final @Nullable String studioComponentId;
    private final @Nullable StudioComponentType type;

    @OutputCustomType.Constructor({"configuration","description","ec2SecurityGroupIds","initializationScripts","name","scriptParameters","studioComponentId","type"})
    private GetStudioComponentResult(
        @Nullable StudioComponentConfiguration configuration,
        @Nullable String description,
        @Nullable List<String> ec2SecurityGroupIds,
        @Nullable List<StudioComponentInitializationScript> initializationScripts,
        @Nullable String name,
        @Nullable List<StudioComponentScriptParameterKeyValue> scriptParameters,
        @Nullable String studioComponentId,
        @Nullable StudioComponentType type) {
        this.configuration = configuration;
        this.description = description;
        this.ec2SecurityGroupIds = ec2SecurityGroupIds;
        this.initializationScripts = initializationScripts;
        this.name = name;
        this.scriptParameters = scriptParameters;
        this.studioComponentId = studioComponentId;
        this.type = type;
    }

    public Optional<StudioComponentConfiguration> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * <p>The description.</p>
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * <p>The EC2 security groups that control access to the studio component.</p>
     * 
     */
    public List<String> getEc2SecurityGroupIds() {
        return this.ec2SecurityGroupIds == null ? List.of() : this.ec2SecurityGroupIds;
    }
    /**
     * <p>Initialization scripts for studio components.</p>
     * 
     */
    public List<StudioComponentInitializationScript> getInitializationScripts() {
        return this.initializationScripts == null ? List.of() : this.initializationScripts;
    }
    /**
     * <p>The name for the studio component.</p>
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>Parameters for the studio component scripts.</p>
     * 
     */
    public List<StudioComponentScriptParameterKeyValue> getScriptParameters() {
        return this.scriptParameters == null ? List.of() : this.scriptParameters;
    }
    public Optional<String> getStudioComponentId() {
        return Optional.ofNullable(this.studioComponentId);
    }
    public Optional<StudioComponentType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioComponentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StudioComponentConfiguration configuration;
        private @Nullable String description;
        private @Nullable List<String> ec2SecurityGroupIds;
        private @Nullable List<StudioComponentInitializationScript> initializationScripts;
        private @Nullable String name;
        private @Nullable List<StudioComponentScriptParameterKeyValue> scriptParameters;
        private @Nullable String studioComponentId;
        private @Nullable StudioComponentType type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioComponentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.ec2SecurityGroupIds = defaults.ec2SecurityGroupIds;
    	      this.initializationScripts = defaults.initializationScripts;
    	      this.name = defaults.name;
    	      this.scriptParameters = defaults.scriptParameters;
    	      this.studioComponentId = defaults.studioComponentId;
    	      this.type = defaults.type;
        }

        public Builder setConfiguration(@Nullable StudioComponentConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEc2SecurityGroupIds(@Nullable List<String> ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds = ec2SecurityGroupIds;
            return this;
        }

        public Builder setInitializationScripts(@Nullable List<StudioComponentInitializationScript> initializationScripts) {
            this.initializationScripts = initializationScripts;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setScriptParameters(@Nullable List<StudioComponentScriptParameterKeyValue> scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }

        public Builder setStudioComponentId(@Nullable String studioComponentId) {
            this.studioComponentId = studioComponentId;
            return this;
        }

        public Builder setType(@Nullable StudioComponentType type) {
            this.type = type;
            return this;
        }

        public GetStudioComponentResult build() {
            return new GetStudioComponentResult(configuration, description, ec2SecurityGroupIds, initializationScripts, name, scriptParameters, studioComponentId, type);
        }
    }
}
