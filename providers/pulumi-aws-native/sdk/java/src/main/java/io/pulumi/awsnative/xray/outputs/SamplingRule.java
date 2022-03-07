// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SamplingRule {
    /**
     * Matches attributes derived from the request.
     * 
     */
    private final @Nullable Object attributes;
    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * 
     */
    private final @Nullable Double fixedRate;
    /**
     * Matches the HTTP method from a request URL.
     * 
     */
    private final @Nullable String hTTPMethod;
    /**
     * Matches the hostname from a request URL.
     * 
     */
    private final @Nullable String host;
    /**
     * The priority of the sampling rule.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
     * 
     */
    private final @Nullable Integer reservoirSize;
    /**
     * Matches the ARN of the AWS resource on which the service runs.
     * 
     */
    private final @Nullable String resourceARN;
    private final @Nullable String ruleARN;
    private final @Nullable String ruleName;
    /**
     * Matches the name that the service uses to identify itself in segments.
     * 
     */
    private final @Nullable String serviceName;
    /**
     * Matches the origin that the service uses to identify its type in segments.
     * 
     */
    private final @Nullable String serviceType;
    /**
     * Matches the path from a request URL.
     * 
     */
    private final @Nullable String uRLPath;
    /**
     * The version of the sampling rule format (1)
     * 
     */
    private final @Nullable Integer version;

    @OutputCustomType.Constructor({"attributes","fixedRate","hTTPMethod","host","priority","reservoirSize","resourceARN","ruleARN","ruleName","serviceName","serviceType","uRLPath","version"})
    private SamplingRule(
        @Nullable Object attributes,
        @Nullable Double fixedRate,
        @Nullable String hTTPMethod,
        @Nullable String host,
        @Nullable Integer priority,
        @Nullable Integer reservoirSize,
        @Nullable String resourceARN,
        @Nullable String ruleARN,
        @Nullable String ruleName,
        @Nullable String serviceName,
        @Nullable String serviceType,
        @Nullable String uRLPath,
        @Nullable Integer version) {
        this.attributes = attributes;
        this.fixedRate = fixedRate;
        this.hTTPMethod = hTTPMethod;
        this.host = host;
        this.priority = priority;
        this.reservoirSize = reservoirSize;
        this.resourceARN = resourceARN;
        this.ruleARN = ruleARN;
        this.ruleName = ruleName;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.uRLPath = uRLPath;
        this.version = version;
    }

    /**
     * Matches attributes derived from the request.
     * 
    */
    public Optional<Object> getAttributes() {
        return Optional.ofNullable(this.attributes);
    }
    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * 
    */
    public Optional<Double> getFixedRate() {
        return Optional.ofNullable(this.fixedRate);
    }
    /**
     * Matches the HTTP method from a request URL.
     * 
    */
    public Optional<String> getHTTPMethod() {
        return Optional.ofNullable(this.hTTPMethod);
    }
    /**
     * Matches the hostname from a request URL.
     * 
    */
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    /**
     * The priority of the sampling rule.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
     * 
    */
    public Optional<Integer> getReservoirSize() {
        return Optional.ofNullable(this.reservoirSize);
    }
    /**
     * Matches the ARN of the AWS resource on which the service runs.
     * 
    */
    public Optional<String> getResourceARN() {
        return Optional.ofNullable(this.resourceARN);
    }
    public Optional<String> getRuleARN() {
        return Optional.ofNullable(this.ruleARN);
    }
    public Optional<String> getRuleName() {
        return Optional.ofNullable(this.ruleName);
    }
    /**
     * Matches the name that the service uses to identify itself in segments.
     * 
    */
    public Optional<String> getServiceName() {
        return Optional.ofNullable(this.serviceName);
    }
    /**
     * Matches the origin that the service uses to identify its type in segments.
     * 
    */
    public Optional<String> getServiceType() {
        return Optional.ofNullable(this.serviceType);
    }
    /**
     * Matches the path from a request URL.
     * 
    */
    public Optional<String> getURLPath() {
        return Optional.ofNullable(this.uRLPath);
    }
    /**
     * The version of the sampling rule format (1)
     * 
    */
    public Optional<Integer> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object attributes;
        private @Nullable Double fixedRate;
        private @Nullable String hTTPMethod;
        private @Nullable String host;
        private @Nullable Integer priority;
        private @Nullable Integer reservoirSize;
        private @Nullable String resourceARN;
        private @Nullable String ruleARN;
        private @Nullable String ruleName;
        private @Nullable String serviceName;
        private @Nullable String serviceType;
        private @Nullable String uRLPath;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.fixedRate = defaults.fixedRate;
    	      this.hTTPMethod = defaults.hTTPMethod;
    	      this.host = defaults.host;
    	      this.priority = defaults.priority;
    	      this.reservoirSize = defaults.reservoirSize;
    	      this.resourceARN = defaults.resourceARN;
    	      this.ruleARN = defaults.ruleARN;
    	      this.ruleName = defaults.ruleName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.uRLPath = defaults.uRLPath;
    	      this.version = defaults.version;
        }

        public Builder setAttributes(@Nullable Object attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setFixedRate(@Nullable Double fixedRate) {
            this.fixedRate = fixedRate;
            return this;
        }

        public Builder setHTTPMethod(@Nullable String hTTPMethod) {
            this.hTTPMethod = hTTPMethod;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setReservoirSize(@Nullable Integer reservoirSize) {
            this.reservoirSize = reservoirSize;
            return this;
        }

        public Builder setResourceARN(@Nullable String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }

        public Builder setRuleARN(@Nullable String ruleARN) {
            this.ruleARN = ruleARN;
            return this;
        }

        public Builder setRuleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceType(@Nullable String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder setURLPath(@Nullable String uRLPath) {
            this.uRLPath = uRLPath;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public SamplingRule build() {
            return new SamplingRule(attributes, fixedRate, hTTPMethod, host, priority, reservoirSize, resourceARN, ruleARN, ruleName, serviceName, serviceType, uRLPath, version);
        }
    }
}