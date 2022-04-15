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
import io.pulumi.core.internal.Codegen;
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

    public Output<SpotFleetAcceleratorCountRequestArgs> acceleratorCount() {
        return this.acceleratorCount == null ? Codegen.empty() : this.acceleratorCount;
    }

    @Import(name="acceleratorManufacturers")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers;

    public Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers() {
        return this.acceleratorManufacturers == null ? Codegen.empty() : this.acceleratorManufacturers;
    }

    @Import(name="acceleratorNames")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames;

    public Output<List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem>> acceleratorNames() {
        return this.acceleratorNames == null ? Codegen.empty() : this.acceleratorNames;
    }

    @Import(name="acceleratorTotalMemoryMiB")
      private final @Nullable Output<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB;

    public Output<SpotFleetAcceleratorTotalMemoryMiBRequestArgs> acceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB == null ? Codegen.empty() : this.acceleratorTotalMemoryMiB;
    }

    @Import(name="acceleratorTypes")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes;

    public Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes() {
        return this.acceleratorTypes == null ? Codegen.empty() : this.acceleratorTypes;
    }

    @Import(name="bareMetal")
      private final @Nullable Output<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal;

    public Output<SpotFleetInstanceRequirementsRequestBareMetal> bareMetal() {
        return this.bareMetal == null ? Codegen.empty() : this.bareMetal;
    }

    @Import(name="baselineEbsBandwidthMbps")
      private final @Nullable Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps;

    public Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps == null ? Codegen.empty() : this.baselineEbsBandwidthMbps;
    }

    @Import(name="burstablePerformance")
      private final @Nullable Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance;

    public Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance() {
        return this.burstablePerformance == null ? Codegen.empty() : this.burstablePerformance;
    }

    @Import(name="cpuManufacturers")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers;

    public Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers() {
        return this.cpuManufacturers == null ? Codegen.empty() : this.cpuManufacturers;
    }

    @Import(name="excludedInstanceTypes")
      private final @Nullable Output<List<String>> excludedInstanceTypes;

    public Output<List<String>> excludedInstanceTypes() {
        return this.excludedInstanceTypes == null ? Codegen.empty() : this.excludedInstanceTypes;
    }

    @Import(name="instanceGenerations")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations;

    public Output<List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem>> instanceGenerations() {
        return this.instanceGenerations == null ? Codegen.empty() : this.instanceGenerations;
    }

    @Import(name="localStorage")
      private final @Nullable Output<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage;

    public Output<SpotFleetInstanceRequirementsRequestLocalStorage> localStorage() {
        return this.localStorage == null ? Codegen.empty() : this.localStorage;
    }

    @Import(name="localStorageTypes")
      private final @Nullable Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes;

    public Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes() {
        return this.localStorageTypes == null ? Codegen.empty() : this.localStorageTypes;
    }

    @Import(name="memoryGiBPerVCpu")
      private final @Nullable Output<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu;

    public Output<SpotFleetMemoryGiBPerVCpuRequestArgs> memoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu == null ? Codegen.empty() : this.memoryGiBPerVCpu;
    }

    @Import(name="memoryMiB")
      private final @Nullable Output<SpotFleetMemoryMiBRequestArgs> memoryMiB;

    public Output<SpotFleetMemoryMiBRequestArgs> memoryMiB() {
        return this.memoryMiB == null ? Codegen.empty() : this.memoryMiB;
    }

    @Import(name="networkInterfaceCount")
      private final @Nullable Output<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount;

    public Output<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount() {
        return this.networkInterfaceCount == null ? Codegen.empty() : this.networkInterfaceCount;
    }

    @Import(name="onDemandMaxPricePercentageOverLowestPrice")
      private final @Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice;

    public Output<Integer> onDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice == null ? Codegen.empty() : this.onDemandMaxPricePercentageOverLowestPrice;
    }

    @Import(name="requireHibernateSupport")
      private final @Nullable Output<Boolean> requireHibernateSupport;

    public Output<Boolean> requireHibernateSupport() {
        return this.requireHibernateSupport == null ? Codegen.empty() : this.requireHibernateSupport;
    }

    @Import(name="spotMaxPricePercentageOverLowestPrice")
      private final @Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice;

    public Output<Integer> spotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice == null ? Codegen.empty() : this.spotMaxPricePercentageOverLowestPrice;
    }

    @Import(name="totalLocalStorageGB")
      private final @Nullable Output<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB;

    public Output<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB() {
        return this.totalLocalStorageGB == null ? Codegen.empty() : this.totalLocalStorageGB;
    }

    @Import(name="vCpuCount")
      private final @Nullable Output<SpotFleetVCpuCountRangeRequestArgs> vCpuCount;

    public Output<SpotFleetVCpuCountRangeRequestArgs> vCpuCount() {
        return this.vCpuCount == null ? Codegen.empty() : this.vCpuCount;
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
        this.acceleratorCount = Codegen.empty();
        this.acceleratorManufacturers = Codegen.empty();
        this.acceleratorNames = Codegen.empty();
        this.acceleratorTotalMemoryMiB = Codegen.empty();
        this.acceleratorTypes = Codegen.empty();
        this.bareMetal = Codegen.empty();
        this.baselineEbsBandwidthMbps = Codegen.empty();
        this.burstablePerformance = Codegen.empty();
        this.cpuManufacturers = Codegen.empty();
        this.excludedInstanceTypes = Codegen.empty();
        this.instanceGenerations = Codegen.empty();
        this.localStorage = Codegen.empty();
        this.localStorageTypes = Codegen.empty();
        this.memoryGiBPerVCpu = Codegen.empty();
        this.memoryMiB = Codegen.empty();
        this.networkInterfaceCount = Codegen.empty();
        this.onDemandMaxPricePercentageOverLowestPrice = Codegen.empty();
        this.requireHibernateSupport = Codegen.empty();
        this.spotMaxPricePercentageOverLowestPrice = Codegen.empty();
        this.totalLocalStorageGB = Codegen.empty();
        this.vCpuCount = Codegen.empty();
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
            this.acceleratorCount = Codegen.ofNullable(acceleratorCount);
            return this;
        }
        public Builder acceleratorManufacturers(@Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem>> acceleratorManufacturers) {
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }
        public Builder acceleratorManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers) {
            this.acceleratorManufacturers = Codegen.ofNullable(acceleratorManufacturers);
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
            this.acceleratorNames = Codegen.ofNullable(acceleratorNames);
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
            this.acceleratorTotalMemoryMiB = Codegen.ofNullable(acceleratorTotalMemoryMiB);
            return this;
        }
        public Builder acceleratorTypes(@Nullable Output<List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem>> acceleratorTypes) {
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }
        public Builder acceleratorTypes(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes) {
            this.acceleratorTypes = Codegen.ofNullable(acceleratorTypes);
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
            this.bareMetal = Codegen.ofNullable(bareMetal);
            return this;
        }
        public Builder baselineEbsBandwidthMbps(@Nullable Output<SpotFleetBaselineEbsBandwidthMbpsRequestArgs> baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }
        public Builder baselineEbsBandwidthMbps(@Nullable SpotFleetBaselineEbsBandwidthMbpsRequestArgs baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = Codegen.ofNullable(baselineEbsBandwidthMbps);
            return this;
        }
        public Builder burstablePerformance(@Nullable Output<SpotFleetInstanceRequirementsRequestBurstablePerformance> burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public Builder burstablePerformance(@Nullable SpotFleetInstanceRequirementsRequestBurstablePerformance burstablePerformance) {
            this.burstablePerformance = Codegen.ofNullable(burstablePerformance);
            return this;
        }
        public Builder cpuManufacturers(@Nullable Output<List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem>> cpuManufacturers) {
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }
        public Builder cpuManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers) {
            this.cpuManufacturers = Codegen.ofNullable(cpuManufacturers);
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
            this.excludedInstanceTypes = Codegen.ofNullable(excludedInstanceTypes);
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
            this.instanceGenerations = Codegen.ofNullable(instanceGenerations);
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
            this.localStorage = Codegen.ofNullable(localStorage);
            return this;
        }
        public Builder localStorageTypes(@Nullable Output<List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem>> localStorageTypes) {
            this.localStorageTypes = localStorageTypes;
            return this;
        }
        public Builder localStorageTypes(@Nullable List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes) {
            this.localStorageTypes = Codegen.ofNullable(localStorageTypes);
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
            this.memoryGiBPerVCpu = Codegen.ofNullable(memoryGiBPerVCpu);
            return this;
        }
        public Builder memoryMiB(@Nullable Output<SpotFleetMemoryMiBRequestArgs> memoryMiB) {
            this.memoryMiB = memoryMiB;
            return this;
        }
        public Builder memoryMiB(@Nullable SpotFleetMemoryMiBRequestArgs memoryMiB) {
            this.memoryMiB = Codegen.ofNullable(memoryMiB);
            return this;
        }
        public Builder networkInterfaceCount(@Nullable Output<SpotFleetNetworkInterfaceCountRequestArgs> networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        public Builder networkInterfaceCount(@Nullable SpotFleetNetworkInterfaceCountRequestArgs networkInterfaceCount) {
            this.networkInterfaceCount = Codegen.ofNullable(networkInterfaceCount);
            return this;
        }
        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Output<Integer> onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }
        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = Codegen.ofNullable(onDemandMaxPricePercentageOverLowestPrice);
            return this;
        }
        public Builder requireHibernateSupport(@Nullable Output<Boolean> requireHibernateSupport) {
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }
        public Builder requireHibernateSupport(@Nullable Boolean requireHibernateSupport) {
            this.requireHibernateSupport = Codegen.ofNullable(requireHibernateSupport);
            return this;
        }
        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Output<Integer> spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }
        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = Codegen.ofNullable(spotMaxPricePercentageOverLowestPrice);
            return this;
        }
        public Builder totalLocalStorageGB(@Nullable Output<SpotFleetTotalLocalStorageGBRequestArgs> totalLocalStorageGB) {
            this.totalLocalStorageGB = totalLocalStorageGB;
            return this;
        }
        public Builder totalLocalStorageGB(@Nullable SpotFleetTotalLocalStorageGBRequestArgs totalLocalStorageGB) {
            this.totalLocalStorageGB = Codegen.ofNullable(totalLocalStorageGB);
            return this;
        }
        public Builder vCpuCount(@Nullable Output<SpotFleetVCpuCountRangeRequestArgs> vCpuCount) {
            this.vCpuCount = vCpuCount;
            return this;
        }
        public Builder vCpuCount(@Nullable SpotFleetVCpuCountRangeRequestArgs vCpuCount) {
            this.vCpuCount = Codegen.ofNullable(vCpuCount);
            return this;
        }        public SpotFleetInstanceRequirementsRequestArgs build() {
            return new SpotFleetInstanceRequirementsRequestArgs(acceleratorCount, acceleratorManufacturers, acceleratorNames, acceleratorTotalMemoryMiB, acceleratorTypes, bareMetal, baselineEbsBandwidthMbps, burstablePerformance, cpuManufacturers, excludedInstanceTypes, instanceGenerations, localStorage, localStorageTypes, memoryGiBPerVCpu, memoryMiB, networkInterfaceCount, onDemandMaxPricePercentageOverLowestPrice, requireHibernateSupport, spotMaxPricePercentageOverLowestPrice, totalLocalStorageGB, vCpuCount);
        }
    }
}
