// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestAcceleratorNamesItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestAcceleratorTypesItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestBareMetal;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestBurstablePerformance;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestCpuManufacturersItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestInstanceGenerationsItem;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestLocalStorage;
import io.pulumi.awsnative.ec2.enums.EC2FleetInstanceRequirementsRequestLocalStorageTypesItem;
import io.pulumi.awsnative.ec2.inputs.EC2FleetAcceleratorCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetAcceleratorTotalMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetBaselineEbsBandwidthMbpsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetMemoryGiBPerVCpuRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetNetworkInterfaceCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetTotalLocalStorageGBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetVCpuCountRangeRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetInstanceRequirementsRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetInstanceRequirementsRequestArgs Empty = new EC2FleetInstanceRequirementsRequestArgs();

    @InputImport(name="acceleratorCount")
    private final @Nullable Input<EC2FleetAcceleratorCountRequestArgs> acceleratorCount;

    public Input<EC2FleetAcceleratorCountRequestArgs> getAcceleratorCount() {
        return this.acceleratorCount == null ? Input.empty() : this.acceleratorCount;
    }

    @InputImport(name="acceleratorManufacturers")
    private final @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;

    public Input<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> getAcceleratorManufacturers() {
        return this.acceleratorManufacturers == null ? Input.empty() : this.acceleratorManufacturers;
    }

    @InputImport(name="acceleratorNames")
    private final @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;

    public Input<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> getAcceleratorNames() {
        return this.acceleratorNames == null ? Input.empty() : this.acceleratorNames;
    }

    @InputImport(name="acceleratorTotalMemoryMiB")
    private final @Nullable Input<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;

    public Input<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB == null ? Input.empty() : this.acceleratorTotalMemoryMiB;
    }

    @InputImport(name="acceleratorTypes")
    private final @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;

    public Input<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> getAcceleratorTypes() {
        return this.acceleratorTypes == null ? Input.empty() : this.acceleratorTypes;
    }

    @InputImport(name="bareMetal")
    private final @Nullable Input<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal;

    public Input<EC2FleetInstanceRequirementsRequestBareMetal> getBareMetal() {
        return this.bareMetal == null ? Input.empty() : this.bareMetal;
    }

    @InputImport(name="baselineEbsBandwidthMbps")
    private final @Nullable Input<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;

    public Input<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps == null ? Input.empty() : this.baselineEbsBandwidthMbps;
    }

    @InputImport(name="burstablePerformance")
    private final @Nullable Input<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;

    public Input<EC2FleetInstanceRequirementsRequestBurstablePerformance> getBurstablePerformance() {
        return this.burstablePerformance == null ? Input.empty() : this.burstablePerformance;
    }

    @InputImport(name="cpuManufacturers")
    private final @Nullable Input<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;

    public Input<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> getCpuManufacturers() {
        return this.cpuManufacturers == null ? Input.empty() : this.cpuManufacturers;
    }

    @InputImport(name="excludedInstanceTypes")
    private final @Nullable Input<List<String>> excludedInstanceTypes;

    public Input<List<String>> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes == null ? Input.empty() : this.excludedInstanceTypes;
    }

    @InputImport(name="instanceGenerations")
    private final @Nullable Input<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;

    public Input<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> getInstanceGenerations() {
        return this.instanceGenerations == null ? Input.empty() : this.instanceGenerations;
    }

    @InputImport(name="localStorage")
    private final @Nullable Input<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage;

    public Input<EC2FleetInstanceRequirementsRequestLocalStorage> getLocalStorage() {
        return this.localStorage == null ? Input.empty() : this.localStorage;
    }

    @InputImport(name="localStorageTypes")
    private final @Nullable Input<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;

    public Input<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> getLocalStorageTypes() {
        return this.localStorageTypes == null ? Input.empty() : this.localStorageTypes;
    }

    @InputImport(name="memoryGiBPerVCpu")
    private final @Nullable Input<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;

    public Input<EC2FleetMemoryGiBPerVCpuRequestArgs> getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu == null ? Input.empty() : this.memoryGiBPerVCpu;
    }

    @InputImport(name="memoryMiB")
    private final @Nullable Input<EC2FleetMemoryMiBRequestArgs> memoryMiB;

    public Input<EC2FleetMemoryMiBRequestArgs> getMemoryMiB() {
        return this.memoryMiB == null ? Input.empty() : this.memoryMiB;
    }

    @InputImport(name="networkInterfaceCount")
    private final @Nullable Input<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;

    public Input<EC2FleetNetworkInterfaceCountRequestArgs> getNetworkInterfaceCount() {
        return this.networkInterfaceCount == null ? Input.empty() : this.networkInterfaceCount;
    }

    @InputImport(name="onDemandMaxPricePercentageOverLowestPrice")
    private final @Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice;

    public Input<Integer> getOnDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice == null ? Input.empty() : this.onDemandMaxPricePercentageOverLowestPrice;
    }

    @InputImport(name="requireHibernateSupport")
    private final @Nullable Input<Boolean> requireHibernateSupport;

    public Input<Boolean> getRequireHibernateSupport() {
        return this.requireHibernateSupport == null ? Input.empty() : this.requireHibernateSupport;
    }

    @InputImport(name="spotMaxPricePercentageOverLowestPrice")
    private final @Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice;

    public Input<Integer> getSpotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice == null ? Input.empty() : this.spotMaxPricePercentageOverLowestPrice;
    }

    @InputImport(name="totalLocalStorageGB")
    private final @Nullable Input<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;

    public Input<EC2FleetTotalLocalStorageGBRequestArgs> getTotalLocalStorageGB() {
        return this.totalLocalStorageGB == null ? Input.empty() : this.totalLocalStorageGB;
    }

    @InputImport(name="vCpuCount")
    private final @Nullable Input<EC2FleetVCpuCountRangeRequestArgs> vCpuCount;

    public Input<EC2FleetVCpuCountRangeRequestArgs> getVCpuCount() {
        return this.vCpuCount == null ? Input.empty() : this.vCpuCount;
    }

    public EC2FleetInstanceRequirementsRequestArgs(
        @Nullable Input<EC2FleetAcceleratorCountRequestArgs> acceleratorCount,
        @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers,
        @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames,
        @Nullable Input<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB,
        @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes,
        @Nullable Input<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal,
        @Nullable Input<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps,
        @Nullable Input<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance,
        @Nullable Input<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers,
        @Nullable Input<List<String>> excludedInstanceTypes,
        @Nullable Input<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations,
        @Nullable Input<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage,
        @Nullable Input<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes,
        @Nullable Input<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu,
        @Nullable Input<EC2FleetMemoryMiBRequestArgs> memoryMiB,
        @Nullable Input<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount,
        @Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice,
        @Nullable Input<Boolean> requireHibernateSupport,
        @Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice,
        @Nullable Input<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB,
        @Nullable Input<EC2FleetVCpuCountRangeRequestArgs> vCpuCount) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorManufacturers = acceleratorManufacturers;
        this.acceleratorNames = acceleratorNames;
        this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
        this.acceleratorTypes = acceleratorTypes;
        this.bareMetal = bareMetal;
        this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
        this.burstablePerformance = burstablePerformance;
        this.cpuManufacturers = cpuManufacturers;
        this.excludedInstanceTypes = excludedInstanceTypes;
        this.instanceGenerations = instanceGenerations;
        this.localStorage = localStorage;
        this.localStorageTypes = localStorageTypes;
        this.memoryGiBPerVCpu = memoryGiBPerVCpu;
        this.memoryMiB = memoryMiB;
        this.networkInterfaceCount = networkInterfaceCount;
        this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
        this.requireHibernateSupport = requireHibernateSupport;
        this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
        this.totalLocalStorageGB = totalLocalStorageGB;
        this.vCpuCount = vCpuCount;
    }

    private EC2FleetInstanceRequirementsRequestArgs() {
        this.acceleratorCount = Input.empty();
        this.acceleratorManufacturers = Input.empty();
        this.acceleratorNames = Input.empty();
        this.acceleratorTotalMemoryMiB = Input.empty();
        this.acceleratorTypes = Input.empty();
        this.bareMetal = Input.empty();
        this.baselineEbsBandwidthMbps = Input.empty();
        this.burstablePerformance = Input.empty();
        this.cpuManufacturers = Input.empty();
        this.excludedInstanceTypes = Input.empty();
        this.instanceGenerations = Input.empty();
        this.localStorage = Input.empty();
        this.localStorageTypes = Input.empty();
        this.memoryGiBPerVCpu = Input.empty();
        this.memoryMiB = Input.empty();
        this.networkInterfaceCount = Input.empty();
        this.onDemandMaxPricePercentageOverLowestPrice = Input.empty();
        this.requireHibernateSupport = Input.empty();
        this.spotMaxPricePercentageOverLowestPrice = Input.empty();
        this.totalLocalStorageGB = Input.empty();
        this.vCpuCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetInstanceRequirementsRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EC2FleetAcceleratorCountRequestArgs> acceleratorCount;
        private @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;
        private @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;
        private @Nullable Input<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;
        private @Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;
        private @Nullable Input<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal;
        private @Nullable Input<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;
        private @Nullable Input<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;
        private @Nullable Input<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;
        private @Nullable Input<List<String>> excludedInstanceTypes;
        private @Nullable Input<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;
        private @Nullable Input<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage;
        private @Nullable Input<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;
        private @Nullable Input<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;
        private @Nullable Input<EC2FleetMemoryMiBRequestArgs> memoryMiB;
        private @Nullable Input<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;
        private @Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice;
        private @Nullable Input<Boolean> requireHibernateSupport;
        private @Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice;
        private @Nullable Input<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;
        private @Nullable Input<EC2FleetVCpuCountRangeRequestArgs> vCpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetInstanceRequirementsRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorManufacturers = defaults.acceleratorManufacturers;
    	      this.acceleratorNames = defaults.acceleratorNames;
    	      this.acceleratorTotalMemoryMiB = defaults.acceleratorTotalMemoryMiB;
    	      this.acceleratorTypes = defaults.acceleratorTypes;
    	      this.bareMetal = defaults.bareMetal;
    	      this.baselineEbsBandwidthMbps = defaults.baselineEbsBandwidthMbps;
    	      this.burstablePerformance = defaults.burstablePerformance;
    	      this.cpuManufacturers = defaults.cpuManufacturers;
    	      this.excludedInstanceTypes = defaults.excludedInstanceTypes;
    	      this.instanceGenerations = defaults.instanceGenerations;
    	      this.localStorage = defaults.localStorage;
    	      this.localStorageTypes = defaults.localStorageTypes;
    	      this.memoryGiBPerVCpu = defaults.memoryGiBPerVCpu;
    	      this.memoryMiB = defaults.memoryMiB;
    	      this.networkInterfaceCount = defaults.networkInterfaceCount;
    	      this.onDemandMaxPricePercentageOverLowestPrice = defaults.onDemandMaxPricePercentageOverLowestPrice;
    	      this.requireHibernateSupport = defaults.requireHibernateSupport;
    	      this.spotMaxPricePercentageOverLowestPrice = defaults.spotMaxPricePercentageOverLowestPrice;
    	      this.totalLocalStorageGB = defaults.totalLocalStorageGB;
    	      this.vCpuCount = defaults.vCpuCount;
        }

        public Builder setAcceleratorCount(@Nullable Input<EC2FleetAcceleratorCountRequestArgs> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder setAcceleratorCount(@Nullable EC2FleetAcceleratorCountRequestArgs acceleratorCount) {
            this.acceleratorCount = Input.ofNullable(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorManufacturers(@Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers) {
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }

        public Builder setAcceleratorManufacturers(@Nullable List<EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers) {
            this.acceleratorManufacturers = Input.ofNullable(acceleratorManufacturers);
            return this;
        }

        public Builder setAcceleratorNames(@Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames) {
            this.acceleratorNames = acceleratorNames;
            return this;
        }

        public Builder setAcceleratorNames(@Nullable List<EC2FleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames) {
            this.acceleratorNames = Input.ofNullable(acceleratorNames);
            return this;
        }

        public Builder setAcceleratorTotalMemoryMiB(@Nullable Input<EC2FleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
            return this;
        }

        public Builder setAcceleratorTotalMemoryMiB(@Nullable EC2FleetAcceleratorTotalMemoryMiBRequestArgs acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = Input.ofNullable(acceleratorTotalMemoryMiB);
            return this;
        }

        public Builder setAcceleratorTypes(@Nullable Input<List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes) {
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }

        public Builder setAcceleratorTypes(@Nullable List<EC2FleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes) {
            this.acceleratorTypes = Input.ofNullable(acceleratorTypes);
            return this;
        }

        public Builder setBareMetal(@Nullable Input<EC2FleetInstanceRequirementsRequestBareMetal> bareMetal) {
            this.bareMetal = bareMetal;
            return this;
        }

        public Builder setBareMetal(@Nullable EC2FleetInstanceRequirementsRequestBareMetal bareMetal) {
            this.bareMetal = Input.ofNullable(bareMetal);
            return this;
        }

        public Builder setBaselineEbsBandwidthMbps(@Nullable Input<EC2FleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }

        public Builder setBaselineEbsBandwidthMbps(@Nullable EC2FleetBaselineEbsBandwidthMbpsRequestArgs baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = Input.ofNullable(baselineEbsBandwidthMbps);
            return this;
        }

        public Builder setBurstablePerformance(@Nullable Input<EC2FleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }

        public Builder setBurstablePerformance(@Nullable EC2FleetInstanceRequirementsRequestBurstablePerformance burstablePerformance) {
            this.burstablePerformance = Input.ofNullable(burstablePerformance);
            return this;
        }

        public Builder setCpuManufacturers(@Nullable Input<List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers) {
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }

        public Builder setCpuManufacturers(@Nullable List<EC2FleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers) {
            this.cpuManufacturers = Input.ofNullable(cpuManufacturers);
            return this;
        }

        public Builder setExcludedInstanceTypes(@Nullable Input<List<String>> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }

        public Builder setExcludedInstanceTypes(@Nullable List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = Input.ofNullable(excludedInstanceTypes);
            return this;
        }

        public Builder setInstanceGenerations(@Nullable Input<List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }

        public Builder setInstanceGenerations(@Nullable List<EC2FleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations) {
            this.instanceGenerations = Input.ofNullable(instanceGenerations);
            return this;
        }

        public Builder setLocalStorage(@Nullable Input<EC2FleetInstanceRequirementsRequestLocalStorage> localStorage) {
            this.localStorage = localStorage;
            return this;
        }

        public Builder setLocalStorage(@Nullable EC2FleetInstanceRequirementsRequestLocalStorage localStorage) {
            this.localStorage = Input.ofNullable(localStorage);
            return this;
        }

        public Builder setLocalStorageTypes(@Nullable Input<List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes) {
            this.localStorageTypes = localStorageTypes;
            return this;
        }

        public Builder setLocalStorageTypes(@Nullable List<EC2FleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes) {
            this.localStorageTypes = Input.ofNullable(localStorageTypes);
            return this;
        }

        public Builder setMemoryGiBPerVCpu(@Nullable Input<EC2FleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = memoryGiBPerVCpu;
            return this;
        }

        public Builder setMemoryGiBPerVCpu(@Nullable EC2FleetMemoryGiBPerVCpuRequestArgs memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = Input.ofNullable(memoryGiBPerVCpu);
            return this;
        }

        public Builder setMemoryMiB(@Nullable Input<EC2FleetMemoryMiBRequestArgs> memoryMiB) {
            this.memoryMiB = memoryMiB;
            return this;
        }

        public Builder setMemoryMiB(@Nullable EC2FleetMemoryMiBRequestArgs memoryMiB) {
            this.memoryMiB = Input.ofNullable(memoryMiB);
            return this;
        }

        public Builder setNetworkInterfaceCount(@Nullable Input<EC2FleetNetworkInterfaceCountRequestArgs> networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }

        public Builder setNetworkInterfaceCount(@Nullable EC2FleetNetworkInterfaceCountRequestArgs networkInterfaceCount) {
            this.networkInterfaceCount = Input.ofNullable(networkInterfaceCount);
            return this;
        }

        public Builder setOnDemandMaxPricePercentageOverLowestPrice(@Nullable Input<Integer> onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }

        public Builder setOnDemandMaxPricePercentageOverLowestPrice(@Nullable Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = Input.ofNullable(onDemandMaxPricePercentageOverLowestPrice);
            return this;
        }

        public Builder setRequireHibernateSupport(@Nullable Input<Boolean> requireHibernateSupport) {
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }

        public Builder setRequireHibernateSupport(@Nullable Boolean requireHibernateSupport) {
            this.requireHibernateSupport = Input.ofNullable(requireHibernateSupport);
            return this;
        }

        public Builder setSpotMaxPricePercentageOverLowestPrice(@Nullable Input<Integer> spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }

        public Builder setSpotMaxPricePercentageOverLowestPrice(@Nullable Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = Input.ofNullable(spotMaxPricePercentageOverLowestPrice);
            return this;
        }

        public Builder setTotalLocalStorageGB(@Nullable Input<EC2FleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB) {
            this.totalLocalStorageGB = totalLocalStorageGB;
            return this;
        }

        public Builder setTotalLocalStorageGB(@Nullable EC2FleetTotalLocalStorageGBRequestArgs totalLocalStorageGB) {
            this.totalLocalStorageGB = Input.ofNullable(totalLocalStorageGB);
            return this;
        }

        public Builder setVCpuCount(@Nullable Input<EC2FleetVCpuCountRangeRequestArgs> vCpuCount) {
            this.vCpuCount = vCpuCount;
            return this;
        }

        public Builder setVCpuCount(@Nullable EC2FleetVCpuCountRangeRequestArgs vCpuCount) {
            this.vCpuCount = Input.ofNullable(vCpuCount);
            return this;
        }

        public EC2FleetInstanceRequirementsRequestArgs build() {
            return new EC2FleetInstanceRequirementsRequestArgs(acceleratorCount, acceleratorManufacturers, acceleratorNames, acceleratorTotalMemoryMiB, acceleratorTypes, bareMetal, baselineEbsBandwidthMbps, burstablePerformance, cpuManufacturers, excludedInstanceTypes, instanceGenerations, localStorage, localStorageTypes, memoryGiBPerVCpu, memoryMiB, networkInterfaceCount, onDemandMaxPricePercentageOverLowestPrice, requireHibernateSupport, spotMaxPricePercentageOverLowestPrice, totalLocalStorageGB, vCpuCount);
        }
    }
}
