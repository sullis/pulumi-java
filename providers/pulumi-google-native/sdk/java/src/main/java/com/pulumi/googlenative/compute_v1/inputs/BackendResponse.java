// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Message containing information of one individual backend.
 * 
 */
public final class BackendResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendResponse Empty = new BackendResponse();

    /**
     * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
     */
    @Import(name="balancingMode", required=true)
    private String balancingMode;

    /**
     * @return Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
     */
    public String balancingMode() {
        return this.balancingMode;
    }

    /**
     * A multiplier applied to the backend&#39;s target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
     * 
     */
    @Import(name="capacityScaler", required=true)
    private Double capacityScaler;

    /**
     * @return A multiplier applied to the backend&#39;s target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
     * 
     */
    public Double capacityScaler() {
        return this.capacityScaler;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
     * 
     */
    @Import(name="failover", required=true)
    private Boolean failover;

    /**
     * @return This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
     * 
     */
    public Boolean failover() {
        return this.failover;
    }

    /**
     * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
     * 
     */
    @Import(name="group", required=true)
    private String group;

    /**
     * @return The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
     * 
     */
    public String group() {
        return this.group;
    }

    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    @Import(name="maxConnections", required=true)
    private Integer maxConnections;

    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }

    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    @Import(name="maxConnectionsPerEndpoint", required=true)
    private Integer maxConnectionsPerEndpoint;

    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    public Integer maxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint;
    }

    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    @Import(name="maxConnectionsPerInstance", required=true)
    private Integer maxConnectionsPerInstance;

    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    public Integer maxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance;
    }

    /**
     * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    @Import(name="maxRate", required=true)
    private Integer maxRate;

    /**
     * @return Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    public Integer maxRate() {
        return this.maxRate;
    }

    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    @Import(name="maxRatePerEndpoint", required=true)
    private Double maxRatePerEndpoint;

    /**
     * @return Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    public Double maxRatePerEndpoint() {
        return this.maxRatePerEndpoint;
    }

    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    @Import(name="maxRatePerInstance", required=true)
    private Double maxRatePerInstance;

    /**
     * @return Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    public Double maxRatePerInstance() {
        return this.maxRatePerInstance;
    }

    /**
     * Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
     * 
     */
    @Import(name="maxUtilization", required=true)
    private Double maxUtilization;

    /**
     * @return Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
     * 
     */
    public Double maxUtilization() {
        return this.maxUtilization;
    }

    private BackendResponse() {}

    private BackendResponse(BackendResponse $) {
        this.balancingMode = $.balancingMode;
        this.capacityScaler = $.capacityScaler;
        this.description = $.description;
        this.failover = $.failover;
        this.group = $.group;
        this.maxConnections = $.maxConnections;
        this.maxConnectionsPerEndpoint = $.maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = $.maxConnectionsPerInstance;
        this.maxRate = $.maxRate;
        this.maxRatePerEndpoint = $.maxRatePerEndpoint;
        this.maxRatePerInstance = $.maxRatePerInstance;
        this.maxUtilization = $.maxUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendResponse $;

        public Builder() {
            $ = new BackendResponse();
        }

        public Builder(BackendResponse defaults) {
            $ = new BackendResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param balancingMode Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder balancingMode(String balancingMode) {
            $.balancingMode = balancingMode;
            return this;
        }

        /**
         * @param capacityScaler A multiplier applied to the backend&#39;s target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
         * 
         * @return builder
         * 
         */
        public Builder capacityScaler(Double capacityScaler) {
            $.capacityScaler = capacityScaler;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param failover This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
         * 
         * @return builder
         * 
         */
        public Builder failover(Boolean failover) {
            $.failover = failover;
            return this;
        }

        /**
         * @param group The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            $.group = group;
            return this;
        }

        /**
         * @param maxConnections Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
         * 
         * @return builder
         * 
         */
        public Builder maxConnections(Integer maxConnections) {
            $.maxConnections = maxConnections;
            return this;
        }

        /**
         * @param maxConnectionsPerEndpoint Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
         * 
         * @return builder
         * 
         */
        public Builder maxConnectionsPerEndpoint(Integer maxConnectionsPerEndpoint) {
            $.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
            return this;
        }

        /**
         * @param maxConnectionsPerInstance Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
         * 
         * @return builder
         * 
         */
        public Builder maxConnectionsPerInstance(Integer maxConnectionsPerInstance) {
            $.maxConnectionsPerInstance = maxConnectionsPerInstance;
            return this;
        }

        /**
         * @param maxRate Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
         * 
         * @return builder
         * 
         */
        public Builder maxRate(Integer maxRate) {
            $.maxRate = maxRate;
            return this;
        }

        /**
         * @param maxRatePerEndpoint Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
         * 
         * @return builder
         * 
         */
        public Builder maxRatePerEndpoint(Double maxRatePerEndpoint) {
            $.maxRatePerEndpoint = maxRatePerEndpoint;
            return this;
        }

        /**
         * @param maxRatePerInstance Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
         * 
         * @return builder
         * 
         */
        public Builder maxRatePerInstance(Double maxRatePerInstance) {
            $.maxRatePerInstance = maxRatePerInstance;
            return this;
        }

        /**
         * @param maxUtilization Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
         * 
         * @return builder
         * 
         */
        public Builder maxUtilization(Double maxUtilization) {
            $.maxUtilization = maxUtilization;
            return this;
        }

        public BackendResponse build() {
            $.balancingMode = Objects.requireNonNull($.balancingMode, "expected parameter 'balancingMode' to be non-null");
            $.capacityScaler = Objects.requireNonNull($.capacityScaler, "expected parameter 'capacityScaler' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.failover = Objects.requireNonNull($.failover, "expected parameter 'failover' to be non-null");
            $.group = Objects.requireNonNull($.group, "expected parameter 'group' to be non-null");
            $.maxConnections = Objects.requireNonNull($.maxConnections, "expected parameter 'maxConnections' to be non-null");
            $.maxConnectionsPerEndpoint = Objects.requireNonNull($.maxConnectionsPerEndpoint, "expected parameter 'maxConnectionsPerEndpoint' to be non-null");
            $.maxConnectionsPerInstance = Objects.requireNonNull($.maxConnectionsPerInstance, "expected parameter 'maxConnectionsPerInstance' to be non-null");
            $.maxRate = Objects.requireNonNull($.maxRate, "expected parameter 'maxRate' to be non-null");
            $.maxRatePerEndpoint = Objects.requireNonNull($.maxRatePerEndpoint, "expected parameter 'maxRatePerEndpoint' to be non-null");
            $.maxRatePerInstance = Objects.requireNonNull($.maxRatePerInstance, "expected parameter 'maxRatePerInstance' to be non-null");
            $.maxUtilization = Objects.requireNonNull($.maxUtilization, "expected parameter 'maxUtilization' to be non-null");
            return $;
        }
    }

}
