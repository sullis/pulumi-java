// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StatusDetailPropertiesResponse {
    /**
     * The code of the status.
     * 
     */
    private final String code;
    /**
     * The correlation ID of the status.
     * 
     */
    private final String correlationId;
    /**
     * The description of the status.
     * 
     */
    private final String description;
    /**
     * The timestamp of the status.
     * 
     */
    private final String timestamp;
    /**
     * The component of the connected registry corresponding to the status.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"code","correlationId","description","timestamp","type"})
    private StatusDetailPropertiesResponse(
        String code,
        String correlationId,
        String description,
        String timestamp,
        String type) {
        this.code = Objects.requireNonNull(code);
        this.correlationId = Objects.requireNonNull(correlationId);
        this.description = Objects.requireNonNull(description);
        this.timestamp = Objects.requireNonNull(timestamp);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The code of the status.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * The correlation ID of the status.
     * 
    */
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * The description of the status.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The timestamp of the status.
     * 
    */
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * The component of the connected registry corresponding to the status.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusDetailPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String correlationId;
        private String description;
        private String timestamp;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusDetailPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.correlationId = defaults.correlationId;
    	      this.description = defaults.description;
    	      this.timestamp = defaults.timestamp;
    	      this.type = defaults.type;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setCorrelationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public StatusDetailPropertiesResponse build() {
            return new StatusDetailPropertiesResponse(code, correlationId, description, timestamp, type);
        }
    }
}