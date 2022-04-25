// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;VPC connection properties.&lt;/p&gt;
 * 
 */
public final class DataSourceVpcConnectionProperties extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceVpcConnectionProperties Empty = new DataSourceVpcConnectionProperties();

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) for the VPC connection.&lt;/p&gt;
     * 
     */
    @Import(name="vpcConnectionArn", required=true)
    private String vpcConnectionArn;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) for the VPC connection.&lt;/p&gt;
     * 
     */
    public String vpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    private DataSourceVpcConnectionProperties() {}

    private DataSourceVpcConnectionProperties(DataSourceVpcConnectionProperties $) {
        this.vpcConnectionArn = $.vpcConnectionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceVpcConnectionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceVpcConnectionProperties $;

        public Builder() {
            $ = new DataSourceVpcConnectionProperties();
        }

        public Builder(DataSourceVpcConnectionProperties defaults) {
            $ = new DataSourceVpcConnectionProperties(Objects.requireNonNull(defaults));
        }

        /**
         * @param vpcConnectionArn &lt;p&gt;The Amazon Resource Name (ARN) for the VPC connection.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectionArn(String vpcConnectionArn) {
            $.vpcConnectionArn = vpcConnectionArn;
            return this;
        }

        public DataSourceVpcConnectionProperties build() {
            $.vpcConnectionArn = Objects.requireNonNull($.vpcConnectionArn, "expected parameter 'vpcConnectionArn' to be non-null");
            return $;
        }
    }

}
