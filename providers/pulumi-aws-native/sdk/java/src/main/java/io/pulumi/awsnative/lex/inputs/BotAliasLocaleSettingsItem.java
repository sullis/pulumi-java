// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasLocaleSettings;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A locale setting in alias
 * 
 */
public final class BotAliasLocaleSettingsItem extends io.pulumi.resources.InvokeArgs {

    public static final BotAliasLocaleSettingsItem Empty = new BotAliasLocaleSettingsItem();

    @Import(name="botAliasLocaleSetting", required=true)
      private final BotAliasLocaleSettings botAliasLocaleSetting;

    public BotAliasLocaleSettings botAliasLocaleSetting() {
        return this.botAliasLocaleSetting;
    }

    /**
     * A string used to identify the locale
     * 
     */
    @Import(name="localeId", required=true)
      private final String localeId;

    public String localeId() {
        return this.localeId;
    }

    public BotAliasLocaleSettingsItem(
        BotAliasLocaleSettings botAliasLocaleSetting,
        String localeId) {
        this.botAliasLocaleSetting = Objects.requireNonNull(botAliasLocaleSetting, "expected parameter 'botAliasLocaleSetting' to be non-null");
        this.localeId = Objects.requireNonNull(localeId, "expected parameter 'localeId' to be non-null");
    }

    private BotAliasLocaleSettingsItem() {
        this.botAliasLocaleSetting = null;
        this.localeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasLocaleSettingsItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasLocaleSettings botAliasLocaleSetting;
        private String localeId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasLocaleSettingsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botAliasLocaleSetting = defaults.botAliasLocaleSetting;
    	      this.localeId = defaults.localeId;
        }

        public Builder botAliasLocaleSetting(BotAliasLocaleSettings botAliasLocaleSetting) {
            this.botAliasLocaleSetting = Objects.requireNonNull(botAliasLocaleSetting);
            return this;
        }
        public Builder localeId(String localeId) {
            this.localeId = Objects.requireNonNull(localeId);
            return this;
        }        public BotAliasLocaleSettingsItem build() {
            return new BotAliasLocaleSettingsItem(botAliasLocaleSetting, localeId);
        }
    }
}
