// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.domainregistration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListTopLevelDomainAgreementsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListTopLevelDomainAgreementsArgs Empty = new ListTopLevelDomainAgreementsArgs();

    /**
     * If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain transfer as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="forTransfer")
    private @Nullable Output<Boolean> forTransfer;

    /**
     * @return If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain transfer as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> forTransfer() {
        return Optional.ofNullable(this.forTransfer);
    }

    /**
     * If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain privacy as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="includePrivacy")
    private @Nullable Output<Boolean> includePrivacy;

    /**
     * @return If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain privacy as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> includePrivacy() {
        return Optional.ofNullable(this.includePrivacy);
    }

    /**
     * Name of the top-level domain.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the top-level domain.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ListTopLevelDomainAgreementsArgs() {}

    private ListTopLevelDomainAgreementsArgs(ListTopLevelDomainAgreementsArgs $) {
        this.forTransfer = $.forTransfer;
        this.includePrivacy = $.includePrivacy;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListTopLevelDomainAgreementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListTopLevelDomainAgreementsArgs $;

        public Builder() {
            $ = new ListTopLevelDomainAgreementsArgs();
        }

        public Builder(ListTopLevelDomainAgreementsArgs defaults) {
            $ = new ListTopLevelDomainAgreementsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forTransfer If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain transfer as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder forTransfer(@Nullable Output<Boolean> forTransfer) {
            $.forTransfer = forTransfer;
            return this;
        }

        /**
         * @param forTransfer If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain transfer as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder forTransfer(Boolean forTransfer) {
            return forTransfer(Output.of(forTransfer));
        }

        /**
         * @param includePrivacy If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain privacy as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder includePrivacy(@Nullable Output<Boolean> includePrivacy) {
            $.includePrivacy = includePrivacy;
            return this;
        }

        /**
         * @param includePrivacy If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include agreements for domain privacy as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder includePrivacy(Boolean includePrivacy) {
            return includePrivacy(Output.of(includePrivacy));
        }

        /**
         * @param name Name of the top-level domain.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the top-level domain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ListTopLevelDomainAgreementsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
