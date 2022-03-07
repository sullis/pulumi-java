// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.azurenative.media.outputs.TransformOutputResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransformResult {
    /**
     * The UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    private final String created;
    /**
     * An optional verbose description of the Transform.
     * 
     */
    private final @Nullable String description;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The UTC date and time when the Transform was last updated, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    private final String lastModified;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * An array of one or more TransformOutputs that the Transform should generate.
     * 
     */
    private final List<TransformOutputResponse> outputs;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"created","description","id","lastModified","name","outputs","systemData","type"})
    private GetTransformResult(
        String created,
        @Nullable String description,
        String id,
        String lastModified,
        String name,
        List<TransformOutputResponse> outputs,
        SystemDataResponse systemData,
        String type) {
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.name = Objects.requireNonNull(name);
        this.outputs = Objects.requireNonNull(outputs);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * An optional verbose description of the Transform.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The UTC date and time when the Transform was last updated, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An array of one or more TransformOutputs that the Transform should generate.
     * 
    */
    public List<TransformOutputResponse> getOutputs() {
        return this.outputs;
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransformResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private @Nullable String description;
        private String id;
        private String lastModified;
        private String name;
        private List<TransformOutputResponse> outputs;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransformResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputs(List<TransformOutputResponse> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTransformResult build() {
            return new GetTransformResult(created, description, id, lastModified, name, outputs, systemData, type);
        }
    }
}