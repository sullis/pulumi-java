// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.BlobEventsTriggerResponse;
import io.pulumi.azurenative.datafactory.outputs.BlobTriggerResponse;
import io.pulumi.azurenative.datafactory.outputs.ChainingTriggerResponse;
import io.pulumi.azurenative.datafactory.outputs.CustomEventsTriggerResponse;
import io.pulumi.azurenative.datafactory.outputs.MultiplePipelineTriggerResponse;
import io.pulumi.azurenative.datafactory.outputs.RerunTumblingWindowTriggerResponse;
import io.pulumi.azurenative.datafactory.outputs.ScheduleTriggerResponse;
import io.pulumi.azurenative.datafactory.outputs.TumblingWindowTriggerResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTriggerResult {
    /**
     * Etag identifies change in the resource.
     * 
     */
    private final String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * Properties of the trigger.
     * 
     */
    private final Object properties;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","properties","type"})
    private GetTriggerResult(
        String etag,
        String id,
        String name,
        Object properties,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Etag identifies change in the resource.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of the trigger.
     * 
     */
    public Object getProperties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private Object properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setProperties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetTriggerResult build() {
            return new GetTriggerResult(etag, id, name, properties, type);
        }
    }
}
