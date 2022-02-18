// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.CustomActivityReferenceObjectResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomActivityResponse {
    /**
     * Elevation level and scope for the user, default is nonadmin task. Type: string (or Expression with resultType double).
     * 
     */
    private final @Nullable Object autoUserSpecification;
    /**
     * Command for custom activity Type: string (or Expression with resultType string).
     * 
     */
    private final Object command;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * User defined property bag. There is no restriction on the keys or values that can be used. The user specified custom activity has the full responsibility to consume and interpret the content defined.
     * 
     */
    private final @Nullable Map<String,Object> extendedProperties;
    /**
     * Folder path for resource files Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Reference objects
     * 
     */
    private final @Nullable CustomActivityReferenceObjectResponse referenceObjects;
    /**
     * Resource linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse resourceLinkedService;
    /**
     * The retention time for the files submitted for custom activity. Type: double (or Expression with resultType double).
     * 
     */
    private final @Nullable Object retentionTimeInDays;
    /**
     * Type of activity.
     * Expected value is 'Custom'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"autoUserSpecification","command","dependsOn","description","extendedProperties","folderPath","linkedServiceName","name","policy","referenceObjects","resourceLinkedService","retentionTimeInDays","type","userProperties"})
    private CustomActivityResponse(
        @Nullable Object autoUserSpecification,
        Object command,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Map<String,Object> extendedProperties,
        @Nullable Object folderPath,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable CustomActivityReferenceObjectResponse referenceObjects,
        @Nullable LinkedServiceReferenceResponse resourceLinkedService,
        @Nullable Object retentionTimeInDays,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.autoUserSpecification = autoUserSpecification;
        this.command = Objects.requireNonNull(command);
        this.dependsOn = dependsOn;
        this.description = description;
        this.extendedProperties = extendedProperties;
        this.folderPath = folderPath;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name);
        this.policy = policy;
        this.referenceObjects = referenceObjects;
        this.resourceLinkedService = resourceLinkedService;
        this.retentionTimeInDays = retentionTimeInDays;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    /**
     * Elevation level and scope for the user, default is nonadmin task. Type: string (or Expression with resultType double).
     * 
     */
    public Optional<Object> getAutoUserSpecification() {
        return Optional.ofNullable(this.autoUserSpecification);
    }
    /**
     * Command for custom activity Type: string (or Expression with resultType string).
     * 
     */
    public Object getCommand() {
        return this.command;
    }
    /**
     * Activity depends on condition.
     * 
     */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * User defined property bag. There is no restriction on the keys or values that can be used. The user specified custom activity has the full responsibility to consume and interpret the content defined.
     * 
     */
    public Map<String,Object> getExtendedProperties() {
        return this.extendedProperties == null ? Map.of() : this.extendedProperties;
    }
    /**
     * Folder path for resource files Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * Linked service reference.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
     */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Reference objects
     * 
     */
    public Optional<CustomActivityReferenceObjectResponse> getReferenceObjects() {
        return Optional.ofNullable(this.referenceObjects);
    }
    /**
     * Resource linked service reference.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> getResourceLinkedService() {
        return Optional.ofNullable(this.resourceLinkedService);
    }
    /**
     * The retention time for the files submitted for custom activity. Type: double (or Expression with resultType double).
     * 
     */
    public Optional<Object> getRetentionTimeInDays() {
        return Optional.ofNullable(this.retentionTimeInDays);
    }
    /**
     * Type of activity.
     * Expected value is 'Custom'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
     */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object autoUserSpecification;
        private Object command;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Map<String,Object> extendedProperties;
        private @Nullable Object folderPath;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable CustomActivityReferenceObjectResponse referenceObjects;
        private @Nullable LinkedServiceReferenceResponse resourceLinkedService;
        private @Nullable Object retentionTimeInDays;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUserSpecification = defaults.autoUserSpecification;
    	      this.command = defaults.command;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.folderPath = defaults.folderPath;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.referenceObjects = defaults.referenceObjects;
    	      this.resourceLinkedService = defaults.resourceLinkedService;
    	      this.retentionTimeInDays = defaults.retentionTimeInDays;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setAutoUserSpecification(@Nullable Object autoUserSpecification) {
            this.autoUserSpecification = autoUserSpecification;
            return this;
        }

        public Builder setCommand(Object command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExtendedProperties(@Nullable Map<String,Object> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setReferenceObjects(@Nullable CustomActivityReferenceObjectResponse referenceObjects) {
            this.referenceObjects = referenceObjects;
            return this;
        }

        public Builder setResourceLinkedService(@Nullable LinkedServiceReferenceResponse resourceLinkedService) {
            this.resourceLinkedService = resourceLinkedService;
            return this;
        }

        public Builder setRetentionTimeInDays(@Nullable Object retentionTimeInDays) {
            this.retentionTimeInDays = retentionTimeInDays;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public CustomActivityResponse build() {
            return new CustomActivityResponse(autoUserSpecification, command, dependsOn, description, extendedProperties, folderPath, linkedServiceName, name, policy, referenceObjects, resourceLinkedService, retentionTimeInDays, type, userProperties);
        }
    }
}
