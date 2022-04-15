// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CrawlerRecrawlPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerRecrawlPolicyGetArgs Empty = new CrawlerRecrawlPolicyGetArgs();

    /**
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last crawler run. Valid Values are: `CRAWL_EVERYTHING` and `CRAWL_NEW_FOLDERS_ONLY`. Default value is `CRAWL_EVERYTHING`.
     * 
     */
    @Import(name="recrawlBehavior")
      private final @Nullable Output<String> recrawlBehavior;

    public Output<String> recrawlBehavior() {
        return this.recrawlBehavior == null ? Codegen.empty() : this.recrawlBehavior;
    }

    public CrawlerRecrawlPolicyGetArgs(@Nullable Output<String> recrawlBehavior) {
        this.recrawlBehavior = recrawlBehavior;
    }

    private CrawlerRecrawlPolicyGetArgs() {
        this.recrawlBehavior = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerRecrawlPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> recrawlBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerRecrawlPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recrawlBehavior = defaults.recrawlBehavior;
        }

        public Builder recrawlBehavior(@Nullable Output<String> recrawlBehavior) {
            this.recrawlBehavior = recrawlBehavior;
            return this;
        }
        public Builder recrawlBehavior(@Nullable String recrawlBehavior) {
            this.recrawlBehavior = Codegen.ofNullable(recrawlBehavior);
            return this;
        }        public CrawlerRecrawlPolicyGetArgs build() {
            return new CrawlerRecrawlPolicyGetArgs(recrawlBehavior);
        }
    }
}
