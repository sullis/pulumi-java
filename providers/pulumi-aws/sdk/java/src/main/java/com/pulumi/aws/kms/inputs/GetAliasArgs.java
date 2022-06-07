// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    /**
     * The display name of the alias. The name must start with the word &#34;alias&#34; followed by a forward slash (alias/)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The display name of the alias. The name must start with the word &#34;alias&#34; followed by a forward slash (alias/)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetAliasArgs() {}

    private GetAliasArgs(GetAliasArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAliasArgs $;

        public Builder() {
            $ = new GetAliasArgs();
        }

        public Builder(GetAliasArgs defaults) {
            $ = new GetAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The display name of the alias. The name must start with the word &#34;alias&#34; followed by a forward slash (alias/)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The display name of the alias. The name must start with the word &#34;alias&#34; followed by a forward slash (alias/)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAliasArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
