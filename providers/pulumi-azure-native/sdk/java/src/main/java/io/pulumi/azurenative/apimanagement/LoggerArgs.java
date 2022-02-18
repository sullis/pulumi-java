// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.LoggerType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggerArgs Empty = new LoggerArgs();

    /**
     * The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     * 
     */
    @InputImport(name="credentials")
    private final @Nullable Input<Map<String,String>> credentials;

    public Input<Map<String,String>> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * Logger description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether records are buffered in the logger before publishing. Default is assumed to be true.
     * 
     */
    @InputImport(name="isBuffered")
    private final @Nullable Input<Boolean> isBuffered;

    public Input<Boolean> getIsBuffered() {
        return this.isBuffered == null ? Input.empty() : this.isBuffered;
    }

    /**
     * Logger identifier. Must be unique in the API Management service instance.
     * 
     */
    @InputImport(name="loggerId")
    private final @Nullable Input<String> loggerId;

    public Input<String> getLoggerId() {
        return this.loggerId == null ? Input.empty() : this.loggerId;
    }

    /**
     * Logger type.
     * 
     */
    @InputImport(name="loggerType", required=true)
    private final Input<Either<String,LoggerType>> loggerType;

    public Input<Either<String,LoggerType>> getLoggerType() {
        return this.loggerType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure Resource Id of a log target (either Azure Event Hub resource or Azure Application Insights resource).
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public LoggerArgs(
        @Nullable Input<Map<String,String>> credentials,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> isBuffered,
        @Nullable Input<String> loggerId,
        Input<Either<String,LoggerType>> loggerType,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceId,
        Input<String> serviceName) {
        this.credentials = credentials;
        this.description = description;
        this.isBuffered = isBuffered;
        this.loggerId = loggerId;
        this.loggerType = Objects.requireNonNull(loggerType, "expected parameter 'loggerType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private LoggerArgs() {
        this.credentials = Input.empty();
        this.description = Input.empty();
        this.isBuffered = Input.empty();
        this.loggerId = Input.empty();
        this.loggerType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceId = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> credentials;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> isBuffered;
        private @Nullable Input<String> loggerId;
        private Input<Either<String,LoggerType>> loggerType;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceId;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.description = defaults.description;
    	      this.isBuffered = defaults.isBuffered;
    	      this.loggerId = defaults.loggerId;
    	      this.loggerType = defaults.loggerType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setCredentials(@Nullable Input<Map<String,String>> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable Map<String,String> credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIsBuffered(@Nullable Input<Boolean> isBuffered) {
            this.isBuffered = isBuffered;
            return this;
        }

        public Builder setIsBuffered(@Nullable Boolean isBuffered) {
            this.isBuffered = Input.ofNullable(isBuffered);
            return this;
        }

        public Builder setLoggerId(@Nullable Input<String> loggerId) {
            this.loggerId = loggerId;
            return this;
        }

        public Builder setLoggerId(@Nullable String loggerId) {
            this.loggerId = Input.ofNullable(loggerId);
            return this;
        }

        public Builder setLoggerType(Input<Either<String,LoggerType>> loggerType) {
            this.loggerType = Objects.requireNonNull(loggerType);
            return this;
        }

        public Builder setLoggerType(Either<String,LoggerType> loggerType) {
            this.loggerType = Input.of(Objects.requireNonNull(loggerType));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public LoggerArgs build() {
            return new LoggerArgs(credentials, description, isBuffered, loggerId, loggerType, resourceGroupName, resourceId, serviceName);
        }
    }
}
