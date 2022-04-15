// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubnetIdsFilter {
    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
     * For example, if matching against tag `Name`, use:
     * 
     */
    private final String name;
    /**
     * Set of values that are accepted for the given field.
     * Subnet IDs will be selected if any one of the given values match.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private GetSubnetIdsFilter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
     * For example, if matching against tag `Name`, use:
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Set of values that are accepted for the given field.
     * Subnet IDs will be selected if any one of the given values match.
     * 
    */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetIdsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetIdsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetSubnetIdsFilter build() {
            return new GetSubnetIdsFilter(name, values);
        }
    }
}
