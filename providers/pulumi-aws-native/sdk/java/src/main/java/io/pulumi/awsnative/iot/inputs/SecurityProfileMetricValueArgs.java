// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The value to be compared with the metric.
 * 
 */
public final class SecurityProfileMetricValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileMetricValueArgs Empty = new SecurityProfileMetricValueArgs();

    /**
     * If the ComparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
     * 
     */
    @Import(name="cidrs")
      private final @Nullable Output<List<String>> cidrs;

    public Output<List<String>> getCidrs() {
        return this.cidrs == null ? Output.empty() : this.cidrs;
    }

    /**
     * If the ComparisonOperator calls for a numeric value, use this to specify that (integer) numeric value to be compared with the metric.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<String> count;

    public Output<String> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    /**
     * The numeral value of a metric.
     * 
     */
    @Import(name="number")
      private final @Nullable Output<Double> number;

    public Output<Double> getNumber() {
        return this.number == null ? Output.empty() : this.number;
    }

    /**
     * The numeral values of a metric.
     * 
     */
    @Import(name="numbers")
      private final @Nullable Output<List<Double>> numbers;

    public Output<List<Double>> getNumbers() {
        return this.numbers == null ? Output.empty() : this.numbers;
    }

    /**
     * If the ComparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<Integer>> ports;

    public Output<List<Integer>> getPorts() {
        return this.ports == null ? Output.empty() : this.ports;
    }

    /**
     * The string values of a metric.
     * 
     */
    @Import(name="strings")
      private final @Nullable Output<List<String>> strings;

    public Output<List<String>> getStrings() {
        return this.strings == null ? Output.empty() : this.strings;
    }

    public SecurityProfileMetricValueArgs(
        @Nullable Output<List<String>> cidrs,
        @Nullable Output<String> count,
        @Nullable Output<Double> number,
        @Nullable Output<List<Double>> numbers,
        @Nullable Output<List<Integer>> ports,
        @Nullable Output<List<String>> strings) {
        this.cidrs = cidrs;
        this.count = count;
        this.number = number;
        this.numbers = numbers;
        this.ports = ports;
        this.strings = strings;
    }

    private SecurityProfileMetricValueArgs() {
        this.cidrs = Output.empty();
        this.count = Output.empty();
        this.number = Output.empty();
        this.numbers = Output.empty();
        this.ports = Output.empty();
        this.strings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cidrs;
        private @Nullable Output<String> count;
        private @Nullable Output<Double> number;
        private @Nullable Output<List<Double>> numbers;
        private @Nullable Output<List<Integer>> ports;
        private @Nullable Output<List<String>> strings;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
    	      this.count = defaults.count;
    	      this.number = defaults.number;
    	      this.numbers = defaults.numbers;
    	      this.ports = defaults.ports;
    	      this.strings = defaults.strings;
        }

        public Builder cidrs(@Nullable Output<List<String>> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public Builder cidrs(@Nullable List<String> cidrs) {
            this.cidrs = Output.ofNullable(cidrs);
            return this;
        }
        public Builder cidrs(String... cidrs) {
            return cidrs(List.of(cidrs));
        }
        public Builder count(@Nullable Output<String> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable String count) {
            this.count = Output.ofNullable(count);
            return this;
        }
        public Builder number(@Nullable Output<Double> number) {
            this.number = number;
            return this;
        }
        public Builder number(@Nullable Double number) {
            this.number = Output.ofNullable(number);
            return this;
        }
        public Builder numbers(@Nullable Output<List<Double>> numbers) {
            this.numbers = numbers;
            return this;
        }
        public Builder numbers(@Nullable List<Double> numbers) {
            this.numbers = Output.ofNullable(numbers);
            return this;
        }
        public Builder numbers(Double... numbers) {
            return numbers(List.of(numbers));
        }
        public Builder ports(@Nullable Output<List<Integer>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = Output.ofNullable(ports);
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }
        public Builder strings(@Nullable Output<List<String>> strings) {
            this.strings = strings;
            return this;
        }
        public Builder strings(@Nullable List<String> strings) {
            this.strings = Output.ofNullable(strings);
            return this;
        }
        public Builder strings(String... strings) {
            return strings(List.of(strings));
        }        public SecurityProfileMetricValueArgs build() {
            return new SecurityProfileMetricValueArgs(cidrs, count, number, numbers, ports, strings);
        }
    }
}
