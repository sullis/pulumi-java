// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.outputs;

import com.pulumi.awsnative.nimblestudio.enums.StudioComponentType;
import com.pulumi.awsnative.nimblestudio.outputs.StudioComponentConfiguration;
import com.pulumi.awsnative.nimblestudio.outputs.StudioComponentInitializationScript;
import com.pulumi.awsnative.nimblestudio.outputs.StudioComponentScriptParameterKeyValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStudioComponentResult {
    private final @Nullable StudioComponentConfiguration configuration;
    /**
     * @return &lt;p&gt;The description.&lt;/p&gt;
     * 
     */
    private final @Nullable String description;
    /**
     * @return &lt;p&gt;The EC2 security groups that control access to the studio component.&lt;/p&gt;
     * 
     */
    private final @Nullable List<String> ec2SecurityGroupIds;
    /**
     * @return &lt;p&gt;Initialization scripts for studio components.&lt;/p&gt;
     * 
     */
    private final @Nullable List<StudioComponentInitializationScript> initializationScripts;
    /**
     * @return &lt;p&gt;The name for the studio component.&lt;/p&gt;
     * 
     */
    private final @Nullable String name;
    /**
     * @return &lt;p&gt;Parameters for the studio component scripts.&lt;/p&gt;
     * 
     */
    private final @Nullable List<StudioComponentScriptParameterKeyValue> scriptParameters;
    private final @Nullable String studioComponentId;
    private final @Nullable StudioComponentType type;

    @CustomType.Constructor
    private GetStudioComponentResult(
        @CustomType.Parameter("configuration") @Nullable StudioComponentConfiguration configuration,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("ec2SecurityGroupIds") @Nullable List<String> ec2SecurityGroupIds,
        @CustomType.Parameter("initializationScripts") @Nullable List<StudioComponentInitializationScript> initializationScripts,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("scriptParameters") @Nullable List<StudioComponentScriptParameterKeyValue> scriptParameters,
        @CustomType.Parameter("studioComponentId") @Nullable String studioComponentId,
        @CustomType.Parameter("type") @Nullable StudioComponentType type) {
        this.configuration = configuration;
        this.description = description;
        this.ec2SecurityGroupIds = ec2SecurityGroupIds;
        this.initializationScripts = initializationScripts;
        this.name = name;
        this.scriptParameters = scriptParameters;
        this.studioComponentId = studioComponentId;
        this.type = type;
    }

    public Optional<StudioComponentConfiguration> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * @return &lt;p&gt;The description.&lt;/p&gt;
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return &lt;p&gt;The EC2 security groups that control access to the studio component.&lt;/p&gt;
     * 
     */
    public List<String> ec2SecurityGroupIds() {
        return this.ec2SecurityGroupIds == null ? List.of() : this.ec2SecurityGroupIds;
    }
    /**
     * @return &lt;p&gt;Initialization scripts for studio components.&lt;/p&gt;
     * 
     */
    public List<StudioComponentInitializationScript> initializationScripts() {
        return this.initializationScripts == null ? List.of() : this.initializationScripts;
    }
    /**
     * @return &lt;p&gt;The name for the studio component.&lt;/p&gt;
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return &lt;p&gt;Parameters for the studio component scripts.&lt;/p&gt;
     * 
     */
    public List<StudioComponentScriptParameterKeyValue> scriptParameters() {
        return this.scriptParameters == null ? List.of() : this.scriptParameters;
    }
    public Optional<String> studioComponentId() {
        return Optional.ofNullable(this.studioComponentId);
    }
    public Optional<StudioComponentType> type() {
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

        public Builder configuration(@Nullable StudioComponentConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder ec2SecurityGroupIds(@Nullable List<String> ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds = ec2SecurityGroupIds;
            return this;
        }
        public Builder ec2SecurityGroupIds(String... ec2SecurityGroupIds) {
            return ec2SecurityGroupIds(List.of(ec2SecurityGroupIds));
        }
        public Builder initializationScripts(@Nullable List<StudioComponentInitializationScript> initializationScripts) {
            this.initializationScripts = initializationScripts;
            return this;
        }
        public Builder initializationScripts(StudioComponentInitializationScript... initializationScripts) {
            return initializationScripts(List.of(initializationScripts));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder scriptParameters(@Nullable List<StudioComponentScriptParameterKeyValue> scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }
        public Builder scriptParameters(StudioComponentScriptParameterKeyValue... scriptParameters) {
            return scriptParameters(List.of(scriptParameters));
        }
        public Builder studioComponentId(@Nullable String studioComponentId) {
            this.studioComponentId = studioComponentId;
            return this;
        }
        public Builder type(@Nullable StudioComponentType type) {
            this.type = type;
            return this;
        }        public GetStudioComponentResult build() {
            return new GetStudioComponentResult(configuration, description, ec2SecurityGroupIds, initializationScripts, name, scriptParameters, studioComponentId, type);
        }
    }
}
