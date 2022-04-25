// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * 
     */
    @Import(name="amazonSideAsn", required=true)
    private Output<String> amazonSideAsn;

    /**
     * @return The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * 
     */
    public Output<String> amazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * The name of the connection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the connection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GatewayArgs() {}

    private GatewayArgs(GatewayArgs $) {
        this.amazonSideAsn = $.amazonSideAsn;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayArgs $;

        public Builder() {
            $ = new GatewayArgs();
        }

        public Builder(GatewayArgs defaults) {
            $ = new GatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amazonSideAsn The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
         * 
         * @return builder
         * 
         */
        public Builder amazonSideAsn(Output<String> amazonSideAsn) {
            $.amazonSideAsn = amazonSideAsn;
            return this;
        }

        /**
         * @param amazonSideAsn The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
         * 
         * @return builder
         * 
         */
        public Builder amazonSideAsn(String amazonSideAsn) {
            return amazonSideAsn(Output.of(amazonSideAsn));
        }

        /**
         * @param name The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GatewayArgs build() {
            $.amazonSideAsn = Objects.requireNonNull($.amazonSideAsn, "expected parameter 'amazonSideAsn' to be non-null");
            return $;
        }
    }

}
