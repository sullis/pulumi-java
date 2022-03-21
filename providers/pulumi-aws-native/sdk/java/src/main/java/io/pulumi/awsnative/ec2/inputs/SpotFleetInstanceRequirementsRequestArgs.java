// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorNamesItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorTypesItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestBareMetal;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestBurstablePerformance;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestCpuManufacturersItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestInstanceGenerationsItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestLocalStorage;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestLocalStorageTypesItem;
import io.pulumi.awsnative.ec2.inputs.SpotFleetAcceleratorCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetAcceleratorTotalMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetBaselineEbsBandwidthMbpsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetMemoryGiBPerVCpuRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetMemoryMiBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetNetworkInterfaceCountRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetTotalLocalStorageGBRequestArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetVCpuCountRangeRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetInstanceRequirementsRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetInstanceRequirementsRequestArgs Empty = new SpotFleetInstanceRequirementsRequestArgs();

    @Import(name="acceleratorCount")
      private final @Nullable Output<SpotFleetAcceleratorCountRequestArgs> acceleratorCount;

    public Output<SpotFleetAcceleratorCountRequestArgs> getAcceleratorCount() {
        return this.acceleratorCount == null ? Output.empty() : this.acceleratorCount;
    }

    @Import(name="acceleratorManufacturers")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;

    public Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> getAcceleratorManufacturers() {
        return this.acceleratorManufacturers == null ? Output.empty() : this.acceleratorManufacturers;
    }

    @Import(name="acceleratorNames")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;

    public Output<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> getAcceleratorNames() {
        return this.acceleratorNames == null ? Output.empty() : this.acceleratorNames;
    }

    @Import(name="acceleratorTotalMemoryMiB")
      private final @Nullable Output<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;

    public Output<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB == null ? Output.empty() : this.acceleratorTotalMemoryMiB;
    }

    @Import(name="acceleratorTypes")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;

    public Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> getAcceleratorTypes() {
        return this.acceleratorTypes == null ? Output.empty() : this.acceleratorTypes;
    }

    @Import(name="bareMetal")
      private final @Nullable Output<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal;

    public Output<SpotFleetInstanceRequirementsRequestBareMetal> getBareMetal() {
        return this.bareMetal == null ? Output.empty() : this.bareMetal;
    }

    @Import(name="baselineEbsBandwidthMbps")
      private final @Nullable Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;

    public Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps == null ? Output.empty() : this.baselineEbsBandwidthMbps;
    }

    @Import(name="burstablePerformance")
      private final @Nullable Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;

    public Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> getBurstablePerformance() {
        return this.burstablePerformance == null ? Output.empty() : this.burstablePerformance;
    }

    @Import(name="cpuManufacturers")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;

    public Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> getCpuManufacturers() {
        return this.cpuManufacturers == null ? Output.empty() : this.cpuManufacturers;
    }

    @Import(name="excludedInstanceTypes")
      private final @Nullable Output<List<String>> excludedInstanceTypes;

    public Output<List<String>> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes == null ? Output.empty() : this.excludedInstanceTypes;
    }

    @Import(name="instanceGenerations")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;

    public Output<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> getInstanceGenerations() {
        return this.instanceGenerations == null ? Output.empty() : this.instanceGenerations;
    }

    @Import(name="localStorage")
      private final @Nullable Output<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage;

    public Output<SpotFleetInstanceRequirementsRequestLocalStorage> getLocalStorage() {
        return this.localStorage == null ? Output.empty() : this.localStorage;
    }

    @Import(name="localStorageTypes")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;

    public Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> getLocalStorageTypes() {
        return this.localStorageTypes == null ? Output.empty() : this.localStorageTypes;
    }

    @Import(name="memoryGiBPerVCpu")
      private final @Nullable Output<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;

    public Output<SpotFleetMemoryGiBPerVCpuRequestArgs> getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu == null ? Output.empty() : this.memoryGiBPerVCpu;
    }

    @Import(name="memoryMiB")
      private final @Nullable Output<SpotFleetMemoryMiBRequestArgs> memoryMiB;

    public Output<SpotFleetMemoryMiBRequestArgs> getMemoryMiB() {
        return this.memoryMiB == null ? Output.empty() : this.memoryMiB;
    }

    @Import(name="networkInterfaceCount")
      private final @Nullable Output<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;

    public Output<SpotFleetNetworkInterfaceCountRequestArgs> getNetworkInterfaceCount() {
        return this.networkInterfaceCount == null ? Output.empty() : this.networkInterfaceCount;
    }

    @Import(name="onDemandMaxPricePercentageOverLowestPrice")
      private final @Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice;

    public Output<Integer> getOnDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice == null ? Output.empty() : this.onDemandMaxPricePercentageOverLowestPrice;
    }

    @Import(name="requireHibernateSupport")
      private final @Nullable Output<Boolean> requireHibernateSupport;

    public Output<Boolean> getRequireHibernateSupport() {
        return this.requireHibernateSupport == null ? Output.empty() : this.requireHibernateSupport;
    }

    @Import(name="spotMaxPricePercentageOverLowestPrice")
      private final @Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice;

    public Output<Integer> getSpotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice == null ? Output.empty() : this.spotMaxPricePercentageOverLowestPrice;
    }

    @Import(name="totalLocalStorageGB")
      private final @Nullable Output<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;

    public Output<SpotFleetTotalLocalStorageGBRequestArgs> getTotalLocalStorageGB() {
        return this.totalLocalStorageGB == null ? Output.empty() : this.totalLocalStorageGB;
    }

    @Import(name="vCpuCount")
      private final @Nullable Output<SpotFleetVCpuCountRangeRequestArgs> vCpuCount;

    public Output<SpotFleetVCpuCountRangeRequestArgs> getVCpuCount() {
        return this.vCpuCount == null ? Output.empty() : this.vCpuCount;
    }

    public SpotFleetInstanceRequirementsRequestArgs(
        @Nullable Output<SpotFleetAcceleratorCountRequestArgs> acceleratorCount,
        @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers,
        @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames,
        @Nullable Output<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB,
        @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes,
        @Nullable Output<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal,
        @Nullable Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps,
        @Nullable Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance,
        @Nullable Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers,
        @Nullable Output<List<String>> excludedInstanceTypes,
        @Nullable Output<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations,
        @Nullable Output<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage,
        @Nullable Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes,
        @Nullable Output<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu,
        @Nullable Output<SpotFleetMemoryMiBRequestArgs> memoryMiB,
        @Nullable Output<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount,
        @Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice,
        @Nullable Output<Boolean> requireHibernateSupport,
        @Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice,
        @Nullable Output<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB,
        @Nullable Output<SpotFleetVCpuCountRangeRequestArgs> vCpuCount) {
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

    private SpotFleetInstanceRequirementsRequestArgs() {
        this.acceleratorCount = Output.empty();
        this.acceleratorManufacturers = Output.empty();
        this.acceleratorNames = Output.empty();
        this.acceleratorTotalMemoryMiB = Output.empty();
        this.acceleratorTypes = Output.empty();
        this.bareMetal = Output.empty();
        this.baselineEbsBandwidthMbps = Output.empty();
        this.burstablePerformance = Output.empty();
        this.cpuManufacturers = Output.empty();
        this.excludedInstanceTypes = Output.empty();
        this.instanceGenerations = Output.empty();
        this.localStorage = Output.empty();
        this.localStorageTypes = Output.empty();
        this.memoryGiBPerVCpu = Output.empty();
        this.memoryMiB = Output.empty();
        this.networkInterfaceCount = Output.empty();
        this.onDemandMaxPricePercentageOverLowestPrice = Output.empty();
        this.requireHibernateSupport = Output.empty();
        this.spotMaxPricePercentageOverLowestPrice = Output.empty();
        this.totalLocalStorageGB = Output.empty();
        this.vCpuCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetInstanceRequirementsRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SpotFleetAcceleratorCountRequestArgs> acceleratorCount;
        private @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;
        private @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;
        private @Nullable Output<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;
        private @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;
        private @Nullable Output<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal;
        private @Nullable Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;
        private @Nullable Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;
        private @Nullable Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;
        private @Nullable Output<List<String>> excludedInstanceTypes;
        private @Nullable Output<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;
        private @Nullable Output<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage;
        private @Nullable Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;
        private @Nullable Output<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;
        private @Nullable Output<SpotFleetMemoryMiBRequestArgs> memoryMiB;
        private @Nullable Output<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;
        private @Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice;
        private @Nullable Output<Boolean> requireHibernateSupport;
        private @Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice;
        private @Nullable Output<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;
        private @Nullable Output<SpotFleetVCpuCountRangeRequestArgs> vCpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetInstanceRequirementsRequestArgs defaults) {
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

        public Builder acceleratorCount(@Nullable Output<SpotFleetAcceleratorCountRequestArgs> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }
        public Builder acceleratorCount(@Nullable SpotFleetAcceleratorCountRequestArgs acceleratorCount) {
            this.acceleratorCount = Output.ofNullable(acceleratorCount);
            return this;
        }
        public Builder acceleratorManufacturers(@Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers) {
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }
        public Builder acceleratorManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers) {
            this.acceleratorManufacturers = Output.ofNullable(acceleratorManufacturers);
            return this;
        }
        public Builder acceleratorManufacturers(SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem... acceleratorManufacturers) {
            return acceleratorManufacturers(List.of(acceleratorManufacturers));
        }
        public Builder acceleratorNames(@Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames) {
            this.acceleratorNames = acceleratorNames;
            return this;
        }
        public Builder acceleratorNames(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames) {
            this.acceleratorNames = Output.ofNullable(acceleratorNames);
            return this;
        }
        public Builder acceleratorNames(SpotFleetInstanceRequirementsRequestAcceleratorNamesItem... acceleratorNames) {
            return acceleratorNames(List.of(acceleratorNames));
        }
        public Builder acceleratorTotalMemoryMiB(@Nullable Output<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
            return this;
        }
        public Builder acceleratorTotalMemoryMiB(@Nullable SpotFleetAcceleratorTotalMemoryMiBRequestArgs acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = Output.ofNullable(acceleratorTotalMemoryMiB);
            return this;
        }
        public Builder acceleratorTypes(@Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes) {
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }
        public Builder acceleratorTypes(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes) {
            this.acceleratorTypes = Output.ofNullable(acceleratorTypes);
            return this;
        }
        public Builder acceleratorTypes(SpotFleetInstanceRequirementsRequestAcceleratorTypesItem... acceleratorTypes) {
            return acceleratorTypes(List.of(acceleratorTypes));
        }
        public Builder bareMetal(@Nullable Output<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal) {
            this.bareMetal = bareMetal;
            return this;
        }
        public Builder bareMetal(@Nullable SpotFleetInstanceRequirementsRequestBareMetal bareMetal) {
            this.bareMetal = Output.ofNullable(bareMetal);
            return this;
        }
        public Builder baselineEbsBandwidthMbps(@Nullable Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }
        public Builder baselineEbsBandwidthMbps(@Nullable SpotFleetBaselineEbsBandwidthMbpsRequestArgs baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = Output.ofNullable(baselineEbsBandwidthMbps);
            return this;
        }
        public Builder burstablePerformance(@Nullable Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public Builder burstablePerformance(@Nullable SpotFleetInstanceRequirementsRequestBurstablePerformance burstablePerformance) {
            this.burstablePerformance = Output.ofNullable(burstablePerformance);
            return this;
        }
        public Builder cpuManufacturers(@Nullable Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers) {
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }
        public Builder cpuManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers) {
            this.cpuManufacturers = Output.ofNullable(cpuManufacturers);
            return this;
        }
        public Builder cpuManufacturers(SpotFleetInstanceRequirementsRequestCpuManufacturersItem... cpuManufacturers) {
            return cpuManufacturers(List.of(cpuManufacturers));
        }
        public Builder excludedInstanceTypes(@Nullable Output<List<String>> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public Builder excludedInstanceTypes(@Nullable List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = Output.ofNullable(excludedInstanceTypes);
            return this;
        }
        public Builder excludedInstanceTypes(String... excludedInstanceTypes) {
            return excludedInstanceTypes(List.of(excludedInstanceTypes));
        }
        public Builder instanceGenerations(@Nullable Output<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }
        public Builder instanceGenerations(@Nullable List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations) {
            this.instanceGenerations = Output.ofNullable(instanceGenerations);
            return this;
        }
        public Builder instanceGenerations(SpotFleetInstanceRequirementsRequestInstanceGenerationsItem... instanceGenerations) {
            return instanceGenerations(List.of(instanceGenerations));
        }
        public Builder localStorage(@Nullable Output<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage) {
            this.localStorage = localStorage;
            return this;
        }
        public Builder localStorage(@Nullable SpotFleetInstanceRequirementsRequestLocalStorage localStorage) {
            this.localStorage = Output.ofNullable(localStorage);
            return this;
        }
        public Builder localStorageTypes(@Nullable Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes) {
            this.localStorageTypes = localStorageTypes;
            return this;
        }
        public Builder localStorageTypes(@Nullable List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes) {
            this.localStorageTypes = Output.ofNullable(localStorageTypes);
            return this;
        }
        public Builder localStorageTypes(SpotFleetInstanceRequirementsRequestLocalStorageTypesItem... localStorageTypes) {
            return localStorageTypes(List.of(localStorageTypes));
        }
        public Builder memoryGiBPerVCpu(@Nullable Output<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = memoryGiBPerVCpu;
            return this;
        }
        public Builder memoryGiBPerVCpu(@Nullable SpotFleetMemoryGiBPerVCpuRequestArgs memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = Output.ofNullable(memoryGiBPerVCpu);
            return this;
        }
        public Builder memoryMiB(@Nullable Output<SpotFleetMemoryMiBRequestArgs> memoryMiB) {
            this.memoryMiB = memoryMiB;
            return this;
        }
        public Builder memoryMiB(@Nullable SpotFleetMemoryMiBRequestArgs memoryMiB) {
            this.memoryMiB = Output.ofNullable(memoryMiB);
            return this;
        }
        public Builder networkInterfaceCount(@Nullable Output<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        public Builder networkInterfaceCount(@Nullable SpotFleetNetworkInterfaceCountRequestArgs networkInterfaceCount) {
            this.networkInterfaceCount = Output.ofNullable(networkInterfaceCount);
            return this;
        }
        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }
        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = Output.ofNullable(onDemandMaxPricePercentageOverLowestPrice);
            return this;
        }
        public Builder requireHibernateSupport(@Nullable Output<Boolean> requireHibernateSupport) {
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }
        public Builder requireHibernateSupport(@Nullable Boolean requireHibernateSupport) {
            this.requireHibernateSupport = Output.ofNullable(requireHibernateSupport);
            return this;
        }
        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }
        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = Output.ofNullable(spotMaxPricePercentageOverLowestPrice);
            return this;
        }
        public Builder totalLocalStorageGB(@Nullable Output<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB) {
            this.totalLocalStorageGB = totalLocalStorageGB;
            return this;
        }
        public Builder totalLocalStorageGB(@Nullable SpotFleetTotalLocalStorageGBRequestArgs totalLocalStorageGB) {
            this.totalLocalStorageGB = Output.ofNullable(totalLocalStorageGB);
            return this;
        }
        public Builder vCpuCount(@Nullable Output<SpotFleetVCpuCountRangeRequestArgs> vCpuCount) {
            this.vCpuCount = vCpuCount;
            return this;
        }
        public Builder vCpuCount(@Nullable SpotFleetVCpuCountRangeRequestArgs vCpuCount) {
            this.vCpuCount = Output.ofNullable(vCpuCount);
            return this;
        }        public SpotFleetInstanceRequirementsRequestArgs build() {
            return new SpotFleetInstanceRequirementsRequestArgs(acceleratorCount, acceleratorManufacturers, acceleratorNames, acceleratorTotalMemoryMiB, acceleratorTypes, bareMetal, baselineEbsBandwidthMbps, burstablePerformance, cpuManufacturers, excludedInstanceTypes, instanceGenerations, localStorage, localStorageTypes, memoryGiBPerVCpu, memoryMiB, networkInterfaceCount, onDemandMaxPricePercentageOverLowestPrice, requireHibernateSupport, spotMaxPricePercentageOverLowestPrice, totalLocalStorageGB, vCpuCount);
        }
    }
}
