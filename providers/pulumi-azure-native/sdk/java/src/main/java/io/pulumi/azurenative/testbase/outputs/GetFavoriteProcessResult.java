// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFavoriteProcessResult {
    /**
     * The actual name of the favorite process. It will be equal to resource name except for the scenario that the process name contains characters that are not allowed in the resource name.
     * 
     */
    private final String actualProcessName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"actualProcessName","id","name","systemData","type"})
    private GetFavoriteProcessResult(
        String actualProcessName,
        String id,
        String name,
        SystemDataResponse systemData,
        String type) {
        this.actualProcessName = Objects.requireNonNull(actualProcessName);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The actual name of the favorite process. It will be equal to resource name except for the scenario that the process name contains characters that are not allowed in the resource name.
     * 
     */
    public String getActualProcessName() {
        return this.actualProcessName;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFavoriteProcessResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actualProcessName;
        private String id;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFavoriteProcessResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actualProcessName = defaults.actualProcessName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setActualProcessName(String actualProcessName) {
            this.actualProcessName = Objects.requireNonNull(actualProcessName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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

        public GetFavoriteProcessResult build() {
            return new GetFavoriteProcessResult(actualProcessName, id, name, systemData, type);
        }
    }
}
