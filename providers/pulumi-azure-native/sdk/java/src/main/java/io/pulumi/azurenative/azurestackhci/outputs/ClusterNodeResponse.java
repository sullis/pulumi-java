// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterNodeResponse {
    /**
     * Number of physical cores on the cluster node.
     * 
     */
    private final Double coreCount;
    /**
     * Id of the node in the cluster.
     * 
     */
    private final Double id;
    /**
     * Manufacturer of the cluster node hardware.
     * 
     */
    private final String manufacturer;
    /**
     * Total available memory on the cluster node (in GiB).
     * 
     */
    private final Double memoryInGiB;
    /**
     * Model name of the cluster node hardware.
     * 
     */
    private final String model;
    /**
     * Name of the cluster node.
     * 
     */
    private final String name;
    /**
     * Operating system running on the cluster node.
     * 
     */
    private final String osName;
    /**
     * Version of the operating system running on the cluster node.
     * 
     */
    private final String osVersion;
    /**
     * Immutable id of the cluster node.
     * 
     */
    private final String serialNumber;

    @OutputCustomType.Constructor({"coreCount","id","manufacturer","memoryInGiB","model","name","osName","osVersion","serialNumber"})
    private ClusterNodeResponse(
        Double coreCount,
        Double id,
        String manufacturer,
        Double memoryInGiB,
        String model,
        String name,
        String osName,
        String osVersion,
        String serialNumber) {
        this.coreCount = Objects.requireNonNull(coreCount);
        this.id = Objects.requireNonNull(id);
        this.manufacturer = Objects.requireNonNull(manufacturer);
        this.memoryInGiB = Objects.requireNonNull(memoryInGiB);
        this.model = Objects.requireNonNull(model);
        this.name = Objects.requireNonNull(name);
        this.osName = Objects.requireNonNull(osName);
        this.osVersion = Objects.requireNonNull(osVersion);
        this.serialNumber = Objects.requireNonNull(serialNumber);
    }

    /**
     * Number of physical cores on the cluster node.
     * 
    */
    public Double getCoreCount() {
        return this.coreCount;
    }
    /**
     * Id of the node in the cluster.
     * 
    */
    public Double getId() {
        return this.id;
    }
    /**
     * Manufacturer of the cluster node hardware.
     * 
    */
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Total available memory on the cluster node (in GiB).
     * 
    */
    public Double getMemoryInGiB() {
        return this.memoryInGiB;
    }
    /**
     * Model name of the cluster node hardware.
     * 
    */
    public String getModel() {
        return this.model;
    }
    /**
     * Name of the cluster node.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Operating system running on the cluster node.
     * 
    */
    public String getOsName() {
        return this.osName;
    }
    /**
     * Version of the operating system running on the cluster node.
     * 
    */
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Immutable id of the cluster node.
     * 
    */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double coreCount;
        private Double id;
        private String manufacturer;
        private Double memoryInGiB;
        private String model;
        private String name;
        private String osName;
        private String osVersion;
        private String serialNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.id = defaults.id;
    	      this.manufacturer = defaults.manufacturer;
    	      this.memoryInGiB = defaults.memoryInGiB;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.osName = defaults.osName;
    	      this.osVersion = defaults.osVersion;
    	      this.serialNumber = defaults.serialNumber;
        }

        public Builder setCoreCount(Double coreCount) {
            this.coreCount = Objects.requireNonNull(coreCount);
            return this;
        }

        public Builder setId(Double id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = Objects.requireNonNull(manufacturer);
            return this;
        }

        public Builder setMemoryInGiB(Double memoryInGiB) {
            this.memoryInGiB = Objects.requireNonNull(memoryInGiB);
            return this;
        }

        public Builder setModel(String model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOsName(String osName) {
            this.osName = Objects.requireNonNull(osName);
            return this;
        }

        public Builder setOsVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }
        public ClusterNodeResponse build() {
            return new ClusterNodeResponse(coreCount, id, manufacturer, memoryInGiB, model, name, osName, osVersion, serialNumber);
        }
    }
}