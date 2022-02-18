// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RoutePropertiesResponse {
    /**
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    private final @Nullable String condition;
    /**
     * The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     * 
     */
    private final List<String> endpointNames;
    /**
     * Used to specify whether a route is enabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    private final String name;
    /**
     * The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     */
    private final String source;

    @OutputCustomType.Constructor({"condition","endpointNames","isEnabled","name","source"})
    private RoutePropertiesResponse(
        @Nullable String condition,
        List<String> endpointNames,
        Boolean isEnabled,
        String name,
        String source) {
        this.condition = condition;
        this.endpointNames = Objects.requireNonNull(endpointNames);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.name = Objects.requireNonNull(name);
        this.source = Objects.requireNonNull(source);
    }

    /**
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    public Optional<String> getCondition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     * 
     */
    public List<String> getEndpointNames() {
        return this.endpointNames;
    }
    /**
     * Used to specify whether a route is enabled.
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     */
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private List<String> endpointNames;
        private Boolean isEnabled;
        private String name;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public RoutePropertiesResponse build() {
            return new RoutePropertiesResponse(condition, endpointNames, isEnabled, name, source);
        }
    }
}
